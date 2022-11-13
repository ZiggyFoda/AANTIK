package com.aantik.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aantik.demo.entidad.Emprendimiento;
import com.aantik.demo.entidad.Estudiante;
import com.aantik.demo.model.ModEmprendimiento;
import com.aantik.demo.repositorio.EmprendimientoRepositorio;

@Service
public class EmprendimientoCRUD implements EmprendimientoCRUDLocal{

	@Autowired
	EmprendimientoRepositorio repository;
	
	private boolean checkEmprendimientoExiste(Emprendimiento empren) throws Exception {
		Optional<Emprendimiento> emprenEncontrado = repository.findById(empren.getId());
		if(emprenEncontrado.isPresent()) {
			throw new Exception("Usuario ya se encuentra registrado");
		}
		return true;
	}
	
	@Override
	public Emprendimiento crearEmprendimiento(Emprendimiento empren) throws Exception {
		if(checkEmprendimientoExiste(empren)) {
			empren = repository.save(empren);
		}
		return empren;
	}

	@Override
	public Iterable<Emprendimiento> getAll() {
        return repository.findAll();
	}

	public void saveAll(ModEmprendimiento[] empLista) {
		// TODO Auto-generated method stub
		Emprendimiento empren=new Emprendimiento();
		System.out.println("VERIFICANDO "+empLista.length);
		for(int i =0;i<empLista.length;i++) {
			empren=new Emprendimiento();
			if(empLista[i]!=null) {
				empren.setActividadEco (empLista[i].actividadEco) ;                                                   
				empren.setBarrio (empLista[i].barrio) ;                                                         
				empren.setComunidad (empLista[i].comunidad) ;                                                      
				empren.setContacto (empLista[i].contacto) ;                                                
				empren.setCorreoIE (empLista[i].correoIE) ;                                                       
				empren.setCorreoIOS (empLista[i].correoIOS) ;                                                      
				empren.setCupos (empLista[i].cupos) ;                                                          
				empren.setDireccion (empLista[i].direccion) ;                                                      
				empren.setDisponibilidad (empLista[i].disponibilidad) ;                                                 
				empren.setEmpleados (empLista[i].empleados) ;                                                      
				empren.setExperiencia (empLista[i].experiencia) ;                                                    
				empren.setFechaCons (empLista[i].fechaCons) ;                                                      
				empren.setGenero (empLista[i].genero) ;                                                         
				empren.setHorarioAtencion (empLista[i].horarioAtencion) ;                                                
				empren.setHorarioNotif (empLista[i].horarioNotif) ;                                       
				empren.setInterlocutorEmp (empLista[i].interlocutorEmp) ;                                                
				empren.setLimitacion (empLista[i].limitacion) ;                                                     
				empren.setLinAccion (empLista[i].linAccion) ;                                                      
				empren.setLocalidad (empLista[i].localidad) ;                                                      
				empren.setModalidad (empLista[i].modalidad) ;                                                      
				empren.setNIT (empLista[i].NIT) ;                                                            
				empren.setNombreEmp (empLista[i].nombreEmp) ;                                                      
				empren.setNombreInterOS (empLista[i].nombreInterOS) ;                                                  
				empren.setOrgSocial (empLista[i].orgSocial) ;                                                      
				empren.setProdServ (empLista[i].prodServ) ;                                                       
				empren.setPromedio (empLista[i].promedio) ;                                                 
				empren.setTelefonoIE (empLista[i].telefonoIE) ;                                                     
				empren.setTelefonoIOS (empLista[i].telefonoIOS) ;                                                    
				empren.setTemaAsesorar (empLista[i].temaAsesorar) ;                                                   
				empren.setTransporte (empLista[i].transporte) ;                                            
				try {
					crearPreins(empren);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

	private void crearPreins(Emprendimiento empren) {
		// TODO Auto-generated method stub
		
	}

}
