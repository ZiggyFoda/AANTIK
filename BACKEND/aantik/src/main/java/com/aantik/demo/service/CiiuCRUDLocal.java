package com.aantik.demo.service;

import com.aantik.demo.entidad.CIIU;

public interface CiiuCRUDLocal {
	public CIIU crearCIIU(CIIU ciiu) throws Exception;
	public Iterable<CIIU> getAll();
}
