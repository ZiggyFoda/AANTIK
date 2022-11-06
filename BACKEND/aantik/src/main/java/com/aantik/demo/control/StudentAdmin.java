package com.aantik.demo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.aantik.demo.entidad.Estudiante;

import com.aantik.demo.repositorio.EstudianteRepositorio;

@RestController
@RequestMapping("/api")






public class StudentAdmin {
	@Autowired
    private EstudianteRepositorio userRepository;
	/*
	@GetMapping("/student")

	public String fetchUsers(){
	
		return ("hola");;
	    }
*/
}



