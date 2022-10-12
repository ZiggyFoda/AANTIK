package com.aantik.demo.match;

import org.springframework.beans.factory.annotation.Autowired;

import com.aantik.demo.entidad.Estudiante;
import com.aantik.demo.model.Preinscrito;
import com.aantik.demo.service.UserCRUD;

public class Instancias {
	
	@Autowired
	UserCRUD userService;
	
	EstudianteM []estudiantes=new EstudianteM[40];
	EmprendimientoM []emprendimientos=new EmprendimientoM[50];
	public Preinscrito []preinscritos= new Preinscrito[500];
	CSV lectura=new CSV();
	
	void instanciaEstudiantes(String direccion) {
		lectura.leerEstudiantes(estudiantes,direccion);		
		System.out.println(estudiantes[0].disponibilidad);
	}
	
	void instanciaEmprendimientos() {
		lectura.leerEmpredimientos(emprendimientos,"FORMATOEMPR.csv");		 
		System.out.println(emprendimientos[0].actividadEco);
	}
	
	public void instanciaPreinscritos(String direccion) {
		lectura.leerPreinscritos(preinscritos,direccion);		 
		System.out.println(preinscritos[0].nombre);
	}
	
	int getCantEst() {
		int cantidad=0;
		for(int i=0;i<estudiantes.length;i++) {
			if(estudiantes[i]!=null) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	int getCantEmp() {
		int cantidad=0;
		for(int i=0;i<emprendimientos.length;i++) {
			if(emprendimientos[i]!=null) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	
}
