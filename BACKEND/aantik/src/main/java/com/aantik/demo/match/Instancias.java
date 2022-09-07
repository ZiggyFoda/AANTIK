package com.aantik.demo.match;

public class Instancias {
	EstudianteM []estudiantes=new EstudianteM[40];
	EmprendimientoM []emprendimientos=new EmprendimientoM[50];
	CSV lectura=new CSV();
	
	void instanciaEstudiantes() {
		lectura.leerEstudiantes(estudiantes,"test.csv");		
		System.out.println(estudiantes[0].disponibilidad);
	}
	
	void instanciaEmprendimientos() {
		lectura.leerEmpredimientos(emprendimientos,"FORMATOEMPR.csv");		 
		System.out.println(emprendimientos[0].actividadEco);
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
