package com.aantik.demo.entidad;

public interface UserCRUDLocal {
	public User getUserById(Long id) throws Exception;
	public User getUserByUsername(String username) throws Exception;
	public Iterable<User> getAll();
	public boolean login(String username, String password) throws Exception;
	public boolean registro(String username, String password) throws Exception;
}
