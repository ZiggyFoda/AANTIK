package com.aantik.demo.entidad;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Admin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7592471093872158335L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Long id;
	@Column
	private String nombre;
	@Column
	private String correo;	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "admin_user",
			joinColumns=@JoinColumn(name="admin_id"),
			inverseJoinColumns=@JoinColumn(name="user_id"))
	private Set<User> userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Set<User> getUserId() {
		return userId;
	}

	public void setUserId(Set<User> userId) {
		this.userId = userId;
	}
	
	
}
