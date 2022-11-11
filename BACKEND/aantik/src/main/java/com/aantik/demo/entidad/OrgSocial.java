package com.aantik.demo.entidad;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class OrgSocial implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6710829772220987072L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Long id;
	@Column
	private String nombre;
	@Column
	private String correo;
	@Column
	private String direccion;
	@Column
	private String actividadEco;
	@Column
	private String tipoOrg;
	@Column
	private String producServ;
	
	@JoinTable(name = "user",
	joinColumns=@JoinColumn(name="id"),
	inverseJoinColumns=@JoinColumn(name="id"))
	private User userId;

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipoOrg() {
		return tipoOrg;
	}

	public void setTipoOrg(String tipoOrg) {
		this.tipoOrg = tipoOrg;
	}

	public String getProducServ() {
		return producServ;
	}

	public void setProducServ(String producServ) {
		this.producServ = producServ;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}
	
	
}
