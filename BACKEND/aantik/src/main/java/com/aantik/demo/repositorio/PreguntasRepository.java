package com.aantik.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aantik.demo.GaboPrivado.PreguntasModelo;


public interface  PreguntasRepository extends JpaRepository<PreguntasModelo, String> {

}
