package com.aantik.demo.repositorio;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.aantik.demo.model.NoticiaEs;


public interface noticiaRepositorio extends CrudRepository<NoticiaEs,String>{

}