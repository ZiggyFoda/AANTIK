package com.aantik.demo.tejido;

import com.aantik.demo.entidad.Ciiu_Emp;
import com.aantik.demo.entidad.RedTejido;
import com.aantik.demo.model.ModCiiuXemp;
import com.aantik.demo.model.ModRedTejido;
import com.aantik.demo.model.tejidoSocial;

public class tejidoServicio {
	
	public ModRedTejido hacerTejido(Ciiu_Emp buscar,Iterable<RedTejido> redTejido, Iterable<Ciiu_Emp> cruzar) {
		
		ModRedTejido tejido=new ModRedTejido();
		int i=0;
		System.out.println("GENERANDO TEJIDO:");
		//for(int i=0;i<tamLista;i++) {
		for (RedTejido lista: redTejido) {

			if(buscar.getIdCiiu().equals(lista.getEmprenOrigen())) {
				System.out.println("Cliente :"+lista.getEmprenDest());
				//tejido.clientes[i].=lista.getEmprenDest();
			}
			if(buscar.getIdCiiu().equals(lista.getEmprenDest())) {
				System.out.println("Proveedor :"+lista.getEmprenOrigen());
			}
		}
		complemento(cruzar,tejido,buscar.getIdCiiu(),buscar.getIdName());
		return tejido;
	}
	
	public void complemento(Iterable<Ciiu_Emp> aliados,ModRedTejido red, Long ciiuB,String nombre) {
	//	for(int j=0;j<tamAliados;j++) 
		for (Ciiu_Emp lista: aliados){
			if(ciiuB.equals(lista.getIdCiiu()) && !nombre.equals(lista.getIdName())) {
				System.out.println("Aliado "+lista.getIdName());
			}
		}
	}
	
	public ModRedTejido hacerTejidoTest(ModCiiuXemp nodoP,tejidoSocial[] lista, int tamLista, ModCiiuXemp[] aliados,int tamAliados) {
		
		ModRedTejido tejido=new ModRedTejido();
		System.out.println("Tejido con :"+tamLista);
		for(int i=0;i<tamLista;i++) {
			if(nodoP.idCiiu.equals(lista[i].emprenOrigen)) {
				System.out.println("Cliente :"+lista[i].emprenDest);
			}
			if(nodoP.idCiiu.equals(lista[i].emprenDest)) {
				System.out.println("Proveedor :"+lista[i].emprenOrigen);
			}
		}
		complementoTest(aliados,tamAliados,tejido,nodoP.idCiiu,nodoP.nombreEmp);
		return tejido;
	}
	
	public void complementoTest(ModCiiuXemp[] aliados,int tamAliados,ModRedTejido red, Long ciiuB,String nombre) {
		for(int j=0;j<tamAliados;j++) {
			if(ciiuB.equals(aliados[j].idCiiu) && !nombre.equals(aliados[j].nombreEmp)) {
				System.out.println("Aliado "+aliados[j].nombreEmp);
			}
		}
	}
}
