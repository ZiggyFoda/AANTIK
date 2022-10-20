package com.aantik.demo.repositorio;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.aantik.demo.entidad.Diagnostico;


public interface DiagnosticoRepositorio extends CrudRepository<Diagnostico,Long>{
	public Optional<Diagnostico> findById(Long id);
}
