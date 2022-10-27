package com.aantik.demo.service;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aantik.demo.entidad.CIIU;
import com.aantik.demo.repositorio.CiiuRepositorio;

@Service
public class CiiuCRUD implements CiiuCRUDLocal{
	
	@Autowired
	CiiuRepositorio repository;
	
	private boolean checkciiuExiste(CIIU ciiu)  {
		Optional<CIIU> ciiuFindCod = repository.findByCodigo(ciiu.getCodigo());
		System.out.println("dato obtenido------------"+ciiuFindCod);
		if(ciiuFindCod.isPresent()) {
			System.out.println("Objeto repetido: "+ciiu.getActividad()+"-"+ciiu.getCodigo());
			return false;//throw new Exception("Codigo CIIU ya se encuentra registrado");
		}
		return true;
	}
	
	@Override
	public CIIU crearCIIU(CIIU ciiu) {
		if(checkciiuExiste(ciiu)) {
			ciiu = repository.save(ciiu);
		}
		return ciiu;
	}

	@Override
	public Iterable<CIIU> getAll() {
        return repository.findAll();
	}

	public void saveAll(com.aantik.demo.model.CIIU[] CIIUlista,int cant) {
		// TODO Auto-generated method stub
		CIIU addCiiu=new CIIU();
		for(int i =0;i<cant;i++) {
			addCiiu.setActividad(CIIUlista[i].actividad);
			addCiiu.setAgrupacion(CIIUlista[i].agrupacion.toString());
			addCiiu.setCodigo(CIIUlista[i].codigo.toString());
			addCiiu.setDescripcion(CIIUlista[i].descripcion);
			addCiiu.setTipo(CIIUlista[i].tipo);
			addCiiu.setSector(CIIUlista[i].sector);
			addCiiu.setId((CIIUlista[i].codigo));
			crearCIIU(addCiiu);
		}		
	}

}
