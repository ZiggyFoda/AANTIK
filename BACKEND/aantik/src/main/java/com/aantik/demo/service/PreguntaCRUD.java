package com.aantik.demo.service;

import com.aantik.demo.entidad.Preguntas_Dig;

public interface PreguntaCRUD {
	public Preguntas_Dig getUserById(Long id) throws Exception;
	public Preguntas_Dig crearPregunta(Preguntas_Dig user) throws Exception;
}
