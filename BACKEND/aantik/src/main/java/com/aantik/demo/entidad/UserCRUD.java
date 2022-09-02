package com.aantik.demo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aantik.demo.repositorio.UsuarioRepositorio;



@Service
public class UserCRUD implements UserCRUDLocal{
	
	@Autowired
	UsuarioRepositorio repository;
	
	@Override
	public User getUserById(Long id) throws Exception {		
		// TODO Auto-generated method stub
		return repository.findById(id).orElseThrow(() -> new Exception("El usuario para editar no existe."));	
	}
	
	public Iterable<User> getAll(){
        return repository.findAll();
    }

	@Override
	public boolean login(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		User usuario= getUserByUsername(username);
		if(usuario != null) {
			if (usuario.getPassword().equals(password)) {
				System.out.println("Inicio de sesion exitoso");
				return true;
			}else {
				System.out.println("Inicio de sesion no exitoso");			
			}
		}				
		return false;	
	}

	public boolean registro(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		User usuario= getUserByUsername(username);
		if (usuario.getPassword().equals(password)) {
			System.out.println("Inicio de sesion exitoso");
			return true;
		}else {
			System.out.println("Inicio de sesion no exitoso");			
		}
		return false;	
	}

	@Override
	public User getUserByUsername(String username) throws Exception {
		// TODO Auto-generated method stub
		return repository.findByUsername(username).orElseThrow(() -> new Exception("El usuario no existe."));	
	}

}
