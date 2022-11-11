package com.aantik.demo.repositorio;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.aantik.demo.entidad.Noticia;


public interface noticiaRepositorio extends CrudRepository<Noticia,String>{

}
