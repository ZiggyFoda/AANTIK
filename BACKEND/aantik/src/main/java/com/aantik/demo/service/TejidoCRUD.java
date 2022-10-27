package com.aantik.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aantik.demo.entidad.RedTejido;
import com.aantik.demo.model.tejidoSocial;
import com.aantik.demo.repositorio.TejidoRepositorio;

@Service
public class TejidoCRUD implements TejidoCRUDLocal{
	
	@Autowired
	TejidoRepositorio repository;
	
	@Override
	public RedTejido crearTejido(RedTejido tejido)  {
		if(existe(tejido)) {
			tejido = repository.save(tejido);
		}
		return tejido;
	}

	@Override
	public Iterable<RedTejido> getAll() {
        return repository.findAll();
	}

	@Override
	public boolean existe(RedTejido tejido) {
		Optional<RedTejido> tejidoEncontrado = repository.findById(tejido.getId());
		if(tejidoEncontrado.isPresent()) {
			System.out.println("Nodo ya se encuentra registrado");
			return false;
		}
		return true;
	}

	public void saveAll(tejidoSocial[] redTejido, int cantRed) {
		// TODO Auto-generated method stub
		RedTejido nodoRed=new RedTejido();
		for(int i =0;i<cantRed;i++) {
			nodoRed.setEmprenOrigen(redTejido[i].emprenOrigen);
			nodoRed.setEmprenDest(redTejido[i].emprenDest);
			nodoRed.setId((redTejido[i].id));
			crearTejido(nodoRed);
		}	
	}

}
