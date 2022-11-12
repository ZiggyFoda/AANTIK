package com.aantik.demo.repositorio;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.aantik.demo.entidad.Preguntas_Dig;
import com.aantik.demo.entidad.User;

public interface PreguntaRepositorio extends CrudRepository<Preguntas_Dig,Long>{
	public Optional<Preguntas_Dig> findById(Long id);
	public Optional<Preguntas_Dig> getUserById(Long id) throws Exception;
	public Optional<Preguntas_Dig> findByCodigo(String cod);
	public Optional<Preguntas_Dig> findByPregunta(String pregunta);
}
