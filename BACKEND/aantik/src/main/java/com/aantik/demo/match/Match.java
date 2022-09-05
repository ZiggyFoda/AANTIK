package com.aantik.demo.match;

import java.util.Random;

public class Match {
	//se obtienen de leer las tablas
	int cantEst=25;
	int cantEmp=11;
	int asignados=0;
	int estu[][][]= new int[cantEst][cantEmp+1][2] ;
	int asignaciones[][]= new int[cantEst][2];
	int cupos[][] = new int[cantEmp][2];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Match mt=new Match();
		mt.llenar();
		mt.imprimirD1();
		mt.imprimirD2();
		mt.llenarCupos();
		mt.imprimirCupos();

		mt.operacionInicial();
		System.out.println("----match inicial---");
		mt.mathcInicial();
		System.out.println("----resultado match inicial---");
		mt.imprimirD2();
		System.out.println("----match recursivo---");
		mt.mathc2();
		System.out.println("----resultado match---");
		mt.imprimirD2();
		mt.asignacion();
		
	}
	
	void llenar() { 
		//generar ids random
		for(int i =0;i<cantEst;i++) {
			estu[i][0][0]=i+1;			
			estu[i][0][1]=estu[i][0][0];
		}
		for(int j =1;j<cantEmp+1;j++) {
			//estu[0][j][0]=new Random().nextInt(30)+11;
			estu[0][j][0]=cantEst+1+j;
			cupos[j-1][0]=estu[0][j][0];
		}
		//puntajes 
		for(int i = 0;i<cantEst;i++) {
			for(int j =1;j<cantEmp+1;j++) {
				estu[i][j][1]=new Random().nextInt(30)+31;
				estu[i][j][0]=estu[0][j][0];
			}
		}
	}

	void imprimirD1() {
		System.out.println("id estudiante| id emprendimiento");
		for(int i = 0;i<cantEst;i++) {
			for(int j =0;j<cantEmp+1;j++) {
				System.out.print(estu[i][j][0]+" | ");			
			}
			System.out.println("");
		}
	}
	
	void imprimirD2() {
		System.out.println("id estudiante|  puntaje emprendimiento");
		for(int i = 0;i<cantEst;i++) {
			for(int j =0;j<cantEmp+1;j++) {
				System.out.print(estu[i][j][1]+" | ");			
			}
			System.out.println("");
		}
	}
	
	void imprimirCupos() {
		System.out.println("id entidad | cupos");
		for(int j =0;j<cantEmp;j++) {
			System.out.println(cupos[j][0]+" | "+cupos[j][1]);			
		}
		System.out.println("");
	}
	
	void llenarCupos() {
		for(int j =0;j<cantEmp;j++) {
			cupos[j][1]=new Random().nextInt(3)+1;
		}
	}
	
	boolean dispo(EstudianteM est, EmprendimientoM emp){
	  String es;
	  String em;
	  es= est.disponibilidad;
	  em = emp.disponibilidad;
	  for(int i = 0; i < es.length(); i=i+4){
	    for(int j = 0; j < em.length(); j=j+4){//sacar sub string de 3 char
	      if(es.equals(em) ){
	        return true;
	        }
	    }
	  }
	  return false;
	}

	int match(EstudianteM est, EmprendimientoM emp){
	  int val = 0;
	  if(est.genero != emp.genero && emp.genero != 'N'){
	    return -999;
	  }else if(est.limitacion==true && emp.limitacion==false){
	    return val-999;
	  }
	  if(est.localidad == emp.localidad){
	    val += est.pUbicacion*2;
	  }
	  if(est.transporte==true){
	    val += -2;
	  }
	  if(est.actividadExtra==true){
	    val += 2;
	  }
	  if(dispo(est, emp)){
	    val += 4;
	  }
	  if(est.tipoOrg == emp.tipoOrg){
	    val += est.pTipoOrg;
	  }
	  if(est.tipoEmp == emp.tipoEmp){
	    val += est.pTipoOrg;
	  }
	  if(est.actividadEco == emp.actividadEco){
	    val += est.pActividad;  
	  }
	  if(est.comunidad == emp.comunidad){
	    val += est.pComunidad;
	  }/*
	  if(enfasis(est.enfasis, emp.actividadEco)){
	    val += 2;
	  }*/
	  if(est.modalidad == emp.modalidad){
	    val += 2;
	  }
	  if(est.experiencia == emp.experiencia && est.experiencia == true){
	    val += 5;
	  }
	  if(est.promedio == true && emp.promedio == true){
	    val += 3;
	  }
	  if(est.contacto==emp.contacto){
	    val += 1;
	  }
	  if(est.limitLocalidad.equals(emp.localidad)){
	    val += - est.pUbicacion*2;
	  }
	  return val;		   
	}
	
	void mathcInicial() {
		int mayor=0;
		int idEst=0;
		int idemp=0;
		for(int i=1;i<cantEmp+1;i++) {
			for(int j=0;j<cantEst;j++) {
				if((estu[j][i][1]>mayor)&(estu[j][0][1]!=0)) {
					mayor=estu[j][i][1];
					idEst=j;
					idemp=estu[j][i][0];	
				}
				
			}
			asignaciones[asignados][0]=estu[idEst][0][1];		
			asignaciones[asignados][1]=idemp;
			System.out.println("Asignado a estudiante "+asignaciones[asignados][0]+" el emprendimiento "+asignaciones[asignados][1]);
			asignados++;
			estu[idEst][0][1]=0;
			mayor=0;
		}
	}
	
	void mathc2() {
		int mayor=0;
		int idEst=0;
		int idEmp=0;
		for(int i=0;i<cantEst;i++) {
			if(estu[i][0][1] != 0) {
				for(int j=1;j<cantEmp+1;j++) {
					boolean asig=this.asignado(estu[i][j][0]);
					if((estu[i][j][1]>mayor)&(estu[i][0][1]!=0)&(asig==true)) {
						mayor=estu[i][j][1];
						idEst=i;
						idEmp=estu[i][j][0];	
					}		
				}
				if(mayor!=0) {
					asignaciones[asignados][0]=estu[idEst][0][1];		
					asignaciones[asignados][1]=idEmp;
					System.out.println("Asignado a estudiante "+asignaciones[asignados][0]+" el emprendimiento "+asignaciones[asignados][1]);
					asignados++;
					estu[i][0][1]=0;
					mayor=0;
				}
				
			}			
		}
	}
	
	boolean asignado(int idEmp) {

		System.out.println("Validando cupos en "+idEmp);
		int cuposDis=0;
		for(int i=0;i<asignados;i++) {
			if(asignaciones[i][1]==idEmp) {
				cuposDis++;				
			}			
		}
		System.out.println("cupos asignados"+cuposDis);
		for(int j=0; j<cantEmp;j++) {
			if(cupos[j][0]==idEmp) {
				if(cupos[j][1]>cuposDis) {
					return true;
				}else
					return false;
			}			
		}		
		return false;
	}
	
	boolean validarAsigEst() {
		for(int i=0;i<cantEst;i++) {
			if(estu[i][0][1] != 0) {
				return false;
			}			
		}
		return true;
	}
	
	void operacionInicial() {
		int cuposTotales=0;
		for(int i=0;i<cantEmp;i++) {
				cuposTotales=cuposTotales+cupos[i][1];						
		}
		if(cuposTotales>cantEst) 
			System.out.println("hay mas cupos que estudiantes");
		else if(cuposTotales<cantEst) 
			System.out.println("hay mas estudiantes que cupos en las entidades, quedaran alumnos sin asignacion");	
		if(cantEmp>cantEst) 
			System.out.println("hay mas emprendimientos que estudiantes, sobran emprendimientos");
		/*else if(cantEmp<cantEst) 
			System.out.println("hay mas estudiantes que emprendimientos, quedarán estudiantes sin asignación");
		*/if(cuposTotales==cantEst)
			System.out.println("Cantidad de cupos igual a cantidad de estusdiantes, condiciones optimas de asignación");
		
	}
	
	void asignacion() {
		int cuposTotales=0;
		int cuposAsignados=0;
		System.out.println("----RESULTADOS DE ASIGNACIÓN----");	
		for(int i=0;i<cantEmp;i++) {
			cuposTotales=cuposTotales+cupos[i][1];						
		}
		
		System.out.println("-Cupos totales- "+cuposTotales+" -Asignaciones- "+asignados);	
		if(asignados<cantEst) {
			System.out.println("-Estudiantes sin asignar-");
			for(int i=0;i<cantEst;i++) {
				if(estu[i][0][1]!=0)
					System.out.println(estu[i][0][1]);
			}
		}
		System.out.println("-Asignaciones realizadas-");
		for(int i=0;i<asignados;i++) {
			System.out.println("Estudiante: "+asignaciones[i][0]+" Asignado a emprendimiento "+asignaciones[i][1]);
		}
	}
}
