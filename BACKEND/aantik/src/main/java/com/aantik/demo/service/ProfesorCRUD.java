package com.aantik.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aantik.demo.entidad.Profesor;
import com.aantik.demo.repositorio.ProfesorRepositorio;

@Service
public class ProfesorCRUD implements ProfesorCRUDLocal{

	@Autowired
	ProfesorRepositorio repository;
	
	private boolean checkUsuarioExiste(Profesor profesor) throws Exception {
		Optional<Profesor> profesorEncontrado = repository.findById(profesor.getId());
		if(profesorEncontrado.isPresent()) {
			throw new Exception("Usuario ya se encuentra registrado");
		}
		return true;
	}
	
	@Override
	public Profesor crearProfesor(Profesor profesor) throws Exception {
		if(checkUsuarioExiste(profesor)) {
			profesor = repository.save(profesor);
		}
		return profesor;
	}

	@Override
	public Iterable<Profesor> getAll() {
        return repository.findAll();
	}

}
