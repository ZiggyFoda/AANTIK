package com.aantik.demo.repositorio;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.aantik.demo.model.ModAsig;


public interface AsigRepositorio extends CrudRepository<ModAsig,Long>{

}