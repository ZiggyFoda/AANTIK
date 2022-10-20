package com.aantik.demo.service;

import com.aantik.demo.entidad.OrgSocial;

public interface OrgSocialCRUDLocal {
	public OrgSocial crearOrganizacion(OrgSocial org) throws Exception;
	public Iterable<OrgSocial> getAll();
}
