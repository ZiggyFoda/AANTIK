package com.aantik.demo.tejido;

import com.aantik.demo.model.ModCiiuXemp;
import com.aantik.demo.model.RedTejido;
import com.aantik.demo.model.tejidoSocial;

public class tejidoServicio {
	
	public RedTejido hacerTejido(ModCiiuXemp nodoP,tejidoSocial[] lista, int tamLista, ModCiiuXemp[] aliados,int tamAliados) {
		
		RedTejido tejido=new RedTejido();
		System.out.println("Tejido con :"+tamLista);
		for(int i=0;i<tamLista;i++) {
			if(nodoP.idCiiu.equals(lista[i].emprenOrigen)) {
				System.out.println("Cliente :"+lista[i].emprenDest);
			}
			if(nodoP.idCiiu.equals(lista[i].emprenDest)) {
				System.out.println("Proveedor :"+lista[i].emprenOrigen);
			}
		}
		complemento(aliados,tamAliados,tejido,nodoP.idCiiu);
		return tejido;
	}
	
	public void complemento(ModCiiuXemp[] aliados,int tamAliados,RedTejido red, Long ciiuB) {
		for(int j=0;j<tamAliados;j++) {
			if(ciiuB.equals(aliados[j].idCiiu)) {
				System.out.println("Aliado "+aliados[j].nombreEmp);
			}
		}
	}
}
