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
public class Coordinador implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6419083030906654410L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Long id;
	@Column
	private String nombre;
	@Column
	private String correo;	
	@Column
	private String asignatura;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "coordinador_user",
			joinColumns=@JoinColumn(name="coordinador_id"),
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

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public Set<User> getUserId() {
		return userId;
	}

	public void setUserId(Set<User> userId) {
		this.userId = userId;
	}
	
	
}
