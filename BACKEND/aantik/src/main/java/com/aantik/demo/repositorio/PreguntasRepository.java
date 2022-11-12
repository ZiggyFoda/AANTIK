package com.aantik.demo.repositorio;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aantik.demo.entidad.PreguntasModeloB;


public interface  PreguntasRepository extends JpaRepository<PreguntasModeloB, Long> {
   Optional<PreguntasModeloB>findByindicaid(String indicaid);
   
   //Optional<PreguntasModeloB> findById(Long id);
}
