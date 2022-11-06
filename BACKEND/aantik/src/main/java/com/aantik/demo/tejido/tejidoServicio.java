package com.aantik.demo.tejido;

import com.aantik.demo.entidad.Ciiu_Emp;
import com.aantik.demo.entidad.RedTejido;
import com.aantik.demo.model.ModCiiuXemp;
import com.aantik.demo.model.ModRedTejido;
import com.aantik.demo.model.RedNodoHijo;
import com.aantik.demo.model.tejidoSocial;

public class tejidoServicio {
	
	public ModRedTejido hacerTejido(Ciiu_Emp buscar,Iterable<RedTejido> redTejido, Iterable<Ciiu_Emp> cruzar) {
		
		ModRedTejido tejido=new ModRedTejido();
		tejido.clientes=new RedNodoHijo[5];
		tejido.proveedores=new RedNodoHijo[5];
		tejido.aliados=new RedNodoHijo[5];
		int i=0,j=0;
		System.out.println("GENERANDO TEJIDO:");
		for (RedTejido lista: redTejido) {

			if(buscar.getIdCiiu().equals(lista.getEmprenOrigen()) && i<5) {
				System.out.println("Cliente :"+lista.getEmprenDest());
				tejido.clientes[i]=new RedNodoHijo();
				tejido.clientes[i].nombre="cliente "+lista.getEmprenDest();
				tejido.clientes[i].teleefono="tel: cliente "+i;
				tejido.clientes[i].producto="producto cliente "+i;
				i++;
			}
			if(buscar.getIdCiiu().equals(lista.getEmprenDest()) && j<5) {
				System.out.println("Proveedor :"+lista.getEmprenOrigen());
				tejido.proveedores[j]=new RedNodoHijo();
				tejido.proveedores[j].nombre="Proveedor "+lista.getEmprenOrigen();
				tejido.proveedores[j].teleefono="tel: Proveedor "+j;
				tejido.proveedores[j].producto="producto Proveedor "+j;
				j++;
			}
		}
		complemento(cruzar,tejido,buscar.getIdCiiu(),buscar.getIdName());
		return tejido;
	}
	
	public void complemento(Iterable<Ciiu_Emp> aliados,ModRedTejido red, Long ciiuB,String nombre) {
	//	for(int j=0;j<tamAliados;j++) 
		int k=0;
		for (Ciiu_Emp lista: aliados){
			if(ciiuB.equals(lista.getIdCiiu()) && !nombre.equals(lista.getIdName()) && k<5) {
				System.out.println("Aliado "+lista.getIdName());
				red.aliados[k]=new RedNodoHijo();
				red.aliados[k].nombre="aliados "+lista.getIdName();
				red.aliados[k].teleefono="tel: aliados "+k;
				red.aliados[k].producto="producto aliados "+k;
				k++;
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
