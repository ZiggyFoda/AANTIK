package com.aantik.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aantik.demo.entidad.BenchmarkingIndica;

public interface BenchPregunRepository extends JpaRepository<BenchmarkingIndica, Long> {
    
}
