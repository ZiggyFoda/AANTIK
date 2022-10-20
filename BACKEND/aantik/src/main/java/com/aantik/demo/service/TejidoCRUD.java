package com.aantik.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aantik.demo.entidad.RedTejido;
import com.aantik.demo.repositorio.TejidoRepositorio;

@Service
public class TejidoCRUD implements TejidoCRUDLocal{
	
	@Autowired
	TejidoRepositorio repository;
	
	@Override
	public RedTejido crearTejido(RedTejido tejido) throws Exception {
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
	public boolean existe(RedTejido tejido) throws Exception {
		Optional<RedTejido> tejidoEncontrado = repository.findById(tejido.getId());
		if(tejidoEncontrado.isPresent()) {
			throw new Exception("Usuario ya se encuentra registrado");
		}
		return true;
	}

}
