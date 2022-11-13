package com.aantik.demo.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.aantik.demo.entidad.Noticia;


public interface noticiaRepositorio extends CrudRepository<Noticia,String>{
	public Optional<Noticia> findById(long id);
	public Optional<Noticia> getUserById(long id) throws Exception;
	/*@Query (value = " SELECT TOP 10 * FROM noticia WHERE id IN (SELECT MAX(id) FROM noticia GROUP BY correo)") 
	public Optional<Noticia> findByCorreo(String correo);
	
	@Query(value = "SELECT * FROM USERS WHERE EMAIL_ADDRESS = ?1", nativeQuery = true)
	  User findByEmailAddress(String emailAddress);*/
}
