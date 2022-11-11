package com.aantik.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aantik.demo.entidad.Estudiante;
import com.aantik.demo.entidad.Profesor;
import com.aantik.demo.entidad.Role;
import com.aantik.demo.entidad.User;
import com.aantik.demo.model.ModEstudiante;
import com.aantik.demo.model.Mpreinscrito;
import com.aantik.demo.repositorio.EstudianteRepositorio;
import com.aantik.demo.repositorio.RoleRepositorio;
import com.aantik.demo.repositorio.UsuarioRepositorio;

@Service
public class EstudianteCRUD implements EstudianteCRUDLocal{

	@Autowired
	EstudianteRepositorio repository;
	@Autowired
	UsuarioRepositorio repositoryUser;
	@Autowired
	RoleRepositorio repositoryRol;
	
	private boolean checkEstudianteExiste(Estudiante estd) throws Exception {
		Optional<Estudiante> estdEncontrado = repository.findById(estd.getId());
		if(estdEncontrado.isPresent()) {
			throw new Exception("Usuario ya se encuentra registrado");
		}
		return true;
	}
	
	@Override
	public Estudiante crearEstudiante(Estudiante estd) throws Exception {
		if(checkEstudianteExiste(estd)) {
			estd = repository.save(estd);
		}
		return estd;
	}

	@Override
	public Iterable<Estudiante> getAll() {
        return repository.findAll();
	}

	public void saveAll(ModEstudiante[] stlista, int cantSt) {
		// TODO Auto-generated method stub
		
	}

	public void saveAllPre(Mpreinscrito[] preLista, int cant) {
		Estudiante preins=new Estudiante();
		System.out.println("VERIFICANDO "+preLista.length);
		for(int i =0;i<preLista.length;i++) {
			preins=new Estudiante();
			if(preLista[i]!=null) {
				preins.setNombre(preLista[i].nombre);
				preins.setCorreo(preLista[i].correo);
				preins.setTelefono(preLista[i].telefono);
				preins.setDireccion(preLista[i].direccion);
				preins.setAsignatura(preLista[i].asignatura);
				preins.setIdEstudiantil(preLista[i].idEstudiantil);
				preins.setIdentificacion(preLista[i].identificacion);
				preins.setTallerSP(preLista[i].tallerSP);
				preins.setFechaSP(preLista[i].fechaSP);
				preins.setInfografia(preLista[i].infografia);
				try {
					crearPreins(preins);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

	public void crearPreins(Estudiante preins) {
		if(existe(preins)) {
			if(preins.getCorreo()!=null && preins.getCorreo().length()>1) {
				User userDoc=new User();
				userDoc.setUsername(preins.getCorreo());
				userDoc.setPassword("1236");
				Role rolDoc;
				rolDoc=repositoryRol.findByName("Preinscrito");
				userDoc.setRoles(rolDoc.getId());
				repositoryUser.save(userDoc);
				System.out.println("insertando usuario");
				preins.setUserId(userDoc.getId());
			}
			if(preins.getNombre() !=null) {
				preins = repository.save(preins);
				System.out.println("insertando preinscrito");
			}
		}
	}

	private boolean existe(Estudiante preins) {
		Optional<Estudiante> preEncontrado = repository.findByNombre(preins.getNombre());
		if(preEncontrado.isPresent()) {
			System.out.println("Nodo ya se encuentra registrado");
			return false;
		}
		return true;
	}

}
