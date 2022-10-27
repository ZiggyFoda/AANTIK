package com.aantik.demo.service;

import com.aantik.demo.entidad.Estudiante;

public interface EstudianteCRUDLocal {
	public Estudiante crearEstudiante(Estudiante estd) throws Exception;
	public Iterable<Estudiante> getAll();
}
