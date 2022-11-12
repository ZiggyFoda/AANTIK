package com.aantik.demo.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aantik.demo.entidad.PreguntasModeloB;


public interface  PreguntasRepository extends JpaRepository<PreguntasModeloB, Long> {
   
}
