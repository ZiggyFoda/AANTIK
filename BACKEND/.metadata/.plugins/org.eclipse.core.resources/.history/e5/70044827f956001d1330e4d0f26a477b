package com.aantik.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.aantik.demo.commons.GenericServiceImp;
import com.aantik.demo.entidad.User;
import com.aantik.demo.repositorio.UsuarioRepositorio;

@Service
public class UserImpAPI extends GenericServiceImp<User, Long> implements UserAPI {

	@Autowired
	private UsuarioRepositorio personaDaoAPI;
	
	@Override
	public CrudRepository<User, Long> getDao() {
		return personaDaoAPI;
	}

}
