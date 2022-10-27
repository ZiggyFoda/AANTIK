package com.aantik.demo.entidad;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Emprendimiento{

	/**
	 * 
	 */

	@Id
    @Column(name = "id")
	private Long id;
	@Column
	private String nombreEmp;
	@Column
	private String nombreInter;	
	@Column
	private String correo;
	@Column
	private String telefono;
	@Column
	private String direccion;
	@Column
	private String prodServ;
	@Column
	private String linAccion;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "emprendimiento_user",
			joinColumns=@JoinColumn(name="emprendimiento_id"),
			inverseJoinColumns=@JoinColumn(name="user_id"))
	private Set<User> userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreEmp() {
		return nombreEmp;
	}

	public void setNombreEmp(String nombreEmp) {
		this.nombreEmp = nombreEmp;
	}

	public String getNombreInter() {
		return nombreInter;
	}

	public void setNombreInter(String nombreInter) {
		this.nombreInter = nombreInter;
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

	public String getProdServ() {
		return prodServ;
	}

	public void setProdServ(String prodServ) {
		this.prodServ = prodServ;
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
