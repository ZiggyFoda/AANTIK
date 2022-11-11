package com.aantik.demo.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aantik.demo.entidad.Profesor;
import com.aantik.demo.entidad.RedTejido;
import com.aantik.demo.entidad.Role;
import com.aantik.demo.entidad.User;
import com.aantik.demo.model.ModDocente;
import com.aantik.demo.model.tejidoSocial;
import com.aantik.demo.repositorio.ProfesorRepositorio;
import com.aantik.demo.repositorio.RoleRepositorio;
import com.aantik.demo.repositorio.UsuarioRepositorio;

@Service
public class ProfesorCRUD implements ProfesorCRUDLocal{

	@Autowired
	ProfesorRepositorio repository;
	@Autowired
	UsuarioRepositorio repositoryUser;
	@Autowired
	RoleRepositorio repositoryRol;
	
	@SuppressWarnings("unused")
	private boolean checkUsuarioExiste(Profesor profesor) throws Exception {
		Optional<Profesor> profesorEncontrado = repository.findById(profesor.getId());
		if(profesorEncontrado.isPresent()) {
			throw new Exception("Usuario ya se encuentra registrado");
		}
		return true;
	}
	
	@Override
	public Profesor crearProfesor(Profesor profesor) throws Exception {
		if(existe(profesor)) {
			User userDoc=new User();
			if(profesor.getCorreo()!=null) {
				userDoc.setUsername(profesor.getCorreo());
				userDoc.setPassword("1236");
				Role rolDoc;
				rolDoc=repositoryRol.findByName("Docente");
				userDoc.setRoles(rolDoc);
				repositoryUser.save(userDoc);
				//profesor.setUserId(userDoc);
			}		
			profesor = repository.save(profesor);
		}
		return profesor;
	}

	@Override
	public Iterable<Profesor> getAll() {
        return repository.findAll();
	}

	@Override
	public boolean existe(Profesor docente) throws Exception {
		Optional<Profesor> docEncontrado = repository.findByNombre(docente.getNombre());
		if(docEncontrado.isPresent()) {
			System.out.println("Nodo ya se encuentra registrado");
			return false;
		}
		return true;
	}
	
	public void saveAll(ModDocente[] docLista, int cantRed) {
		// TODO Auto-generated method stub
		Profesor docente=new Profesor();
		for(int i =0;i<cantRed;i++) {
			docente.setId((long) docLista[i].id);
			docente.setNombre(docLista[i].nombre);
			docente.setVinculacion(docLista[i].vinculacion);
			docente.setTitulo(docLista[i].titulo);
			docente.setEspecialidad(docLista[i].especialidad);
			docente.setAsignatura(docLista[i].asignatura);
			docente.setTelefono(docLista[i].telefono);
			docente.setCorreo(docLista[i].correo);
			docente.setOficina(docLista[i].oficina);
			docente.setDirecRes(docLista[i].direcRes);
			docente.setLocalidad(docLista[i].localidad);
			docente.setSectoEc(docLista[i].sectoEc);
			docente.setHisAse(docLista[i].HisAse);
			docente.setContacto(docLista[i].contacto);
			docente.setLineaAc(docLista[i].lineaAc);
			docente.setSecEco2(docLista[i].secEco2);
			docente.setTipoOS(docLista[i].tipoOS);
			docente.setHorarioNotif(docLista[i].horarioNotif);
			docente.setHorarioAtencion(docLista[i].horarioAtencion);
			docente.setNOdisponibilidad(docLista[i].NOdisponibilidad);
			docente.setLimitacion(docLista[i].limitacion);
			try {
				crearProfesor(docente);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
