package com.aantik.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aantik.demo.entidad.Emprendimiento;
import com.aantik.demo.repositorio.EmprendimientoRepositorio;

@Service
public class EmprendimientoCRUD implements EmprendimientoCRUDLocal{

	@Autowired
	EmprendimientoRepositorio repository;
	
	private boolean checkEmprendimientoExiste(Emprendimiento empren) throws Exception {
		Optional<Emprendimiento> emprenEncontrado = repository.findById(empren.getId());
		if(emprenEncontrado.isPresent()) {
			throw new Exception("Usuario ya se encuentra registrado");
		}
		return true;
	}
	
	@Override
	public Emprendimiento crearEmprendimiento(Emprendimiento empren) throws Exception {
		if(checkEmprendimientoExiste(empren)) {
			empren = repository.save(empren);
		}
		return empren;
	}

	@Override
	public Iterable<Emprendimiento> getAll() {
        return repository.findAll();
	}

}
