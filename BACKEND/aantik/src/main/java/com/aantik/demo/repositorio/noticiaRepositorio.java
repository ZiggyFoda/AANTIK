package com.aantik.demo.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.aantik.demo.entidad.Noticia;


public interface noticiaRepositorio extends CrudRepository<Noticia,String>{
	public Optional<Noticia> findById(long id);
	public Optional<Noticia> getUserById(long id) throws Exception;
	public Optional<Noticia> findByCorreo(String correo);

}
