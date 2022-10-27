package com.aantik.demo.service;

import com.aantik.demo.entidad.Diagnostico;

public interface DiagnosticoCRUDLocal {
	public Diagnostico crearDiagnostico(Diagnostico diag) throws Exception;
	public Iterable<Diagnostico> getAll();
}
