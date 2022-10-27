package com.aantik.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aantik.demo.entidad.OrgSocial;
import com.aantik.demo.repositorio.OrgSocialRepositorio;

@Service
public class OrgSocialCRUD implements OrgSocialCRUDLocal{

	@Autowired
	OrgSocialRepositorio repository;
	
	private boolean checkOrgSocialExiste(OrgSocial org) throws Exception {
		Optional<OrgSocial> orgEncontrado = repository.findById(org.getId());
		if(orgEncontrado.isPresent()) {
			throw new Exception("Usuario ya se encuentra registrado");
		}
		return true;
	}
	
	@Override
	public OrgSocial crearOrganizacion(OrgSocial org) throws Exception {
		if(checkOrgSocialExiste(org)) {
			org = repository.save(org);
		}
		return org;
	}

	@Override
	public Iterable<OrgSocial> getAll() {
        return repository.findAll();
	}

}
