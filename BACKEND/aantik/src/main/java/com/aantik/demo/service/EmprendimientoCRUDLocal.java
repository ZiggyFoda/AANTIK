package com.aantik.demo.service;

import com.aantik.demo.entidad.Emprendimiento;

public interface EmprendimientoCRUDLocal {
	public Emprendimiento crearEmprendimiento(Emprendimiento empren) throws Exception;
	public Iterable<Emprendimiento> getAll();
}
