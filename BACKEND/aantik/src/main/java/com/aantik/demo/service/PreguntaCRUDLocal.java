package com.aantik.demo.service;

import com.aantik.demo.entidad.Preguntas_Dig;
import com.aantik.demo.model.ModeloPregunta;

public interface PreguntaCRUDLocal {
	public Preguntas_Dig getUserById(Long id) throws Exception;
	public void saveAll(ModeloPregunta[] preguntas, int cant5) throws Exception;
	public Preguntas_Dig crearPregunta(Preguntas_Dig preg) throws Exception;
}
