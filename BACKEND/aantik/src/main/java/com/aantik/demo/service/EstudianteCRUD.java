package com.aantik.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aantik.demo.entidad.Estudiante;
import com.aantik.demo.repositorio.EstudianteRepositorio;

@Service
public class EstudianteCRUD implements EstudianteCRUDLocal{

	@Autowired
	EstudianteRepositorio repository;
	
	private boolean checkEstudianteExiste(Estudiante estd) throws Exception {
		Optional<Estudiante> estdEncontrado = repository.findById(estd.getId());
		if(estdEncontrado.isPresent()) {
			throw new Exception("Usuario ya se encuentra registrado");
		}
		return true;
	}
	
	@Override
	public Estudiante crearEstudiante(Estudiante estd) throws Exception {
		if(checkEstudianteExiste(estd)) {
			estd = repository.save(estd);
		}
		return estd;
	}

	@Override
	public Iterable<Estudiante> getAll() {
        return repository.findAll();
	}

}
