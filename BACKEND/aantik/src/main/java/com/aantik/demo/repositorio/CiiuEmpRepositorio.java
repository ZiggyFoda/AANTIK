package com.aantik.demo.repositorio;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.aantik.demo.entidad.Ciiu_Emp;
public interface CiiuEmpRepositorio  extends CrudRepository<Ciiu_Emp,Long>{
	public Optional<Ciiu_Emp> findById(Long id);
	public Optional<Ciiu_Emp> getUserById(Long id) throws Exception;
	public Optional<Ciiu_Emp> findByNombre(String nombre);
}
