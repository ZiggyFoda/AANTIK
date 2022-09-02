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
public class Estudiante implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1116613589802725093L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Long id;
	@Column
	private String nombre;
	@Column
	private String correo;
	@Column
	private String telefono;
	@Column
	private String direccion;		
	@Column
	private String asignatura;
	@Column
	private String clase;
	@Column
	private String entidad;		
	@Column
	private String linAccion;			
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "estudiante_user",
			joinColumns=@JoinColumn(name="estudiante_id"),
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getLinAccion() {
		return linAccion;
	}

	public void setLinAccion(String linAccion) {
		this.linAccion = linAccion;
	}

	public Set<User> getUserId() {
		return userId;
	}

	public void setUserId(Set<User> userId) {
		this.userId = userId;
	}
	
	
}
