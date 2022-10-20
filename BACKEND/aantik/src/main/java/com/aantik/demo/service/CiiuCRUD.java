package com.aantik.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aantik.demo.entidad.CIIU;
import com.aantik.demo.repositorio.CiiuRepositorio;

@Service
public class CiiuCRUD implements CiiuCRUDLocal{
	
	@Autowired
	CiiuRepositorio repository;
	
	private boolean checkciiuExiste(CIIU ciiu) throws Exception {
		Optional<CIIU> ciiuEncontrado = repository.findById(ciiu.getId());
		if(ciiuEncontrado.isPresent()) {
			throw new Exception("Codigo CIIU ya se encuentra registrado");
		}
		return true;
	}
	
	@Override
	public CIIU crearCIIU(CIIU ciiu) throws Exception {
		if(checkciiuExiste(ciiu)) {
			ciiu = repository.save(ciiu);
		}
		return ciiu;
	}

	@Override
	public Iterable<CIIU> getAll() {
        return repository.findAll();
	}

}
