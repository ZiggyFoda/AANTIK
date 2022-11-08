package com.aantik.demo.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.aantik.demo.entidad.OrgSocial;
import com.aantik.demo.repositorio.OrgSocialRepositorio;

@RestController
@RequestMapping("/api")






public class OrgSocAdmin {
	@Autowired
    private OrgSocialRepositorio userRepository;
	
	@GetMapping("/orgAdmin")

    public ArrayList<OrgSocial> obtenerUsuarios(){

       

        return (ArrayList<OrgSocial>) userRepository.findAll();

    }

}



