package com.aantik.demo.entidad;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ciiu_Emp {
	@Id
    @Column(name = "id")
	private Long id;
	@Column
	private String nombre;
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
	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciiu_Emp other = (Ciiu_Emp) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Ciiu_Emp [id=" + id + ", nombre=" + nombre + "]";
	}
	public Ciiu_Emp(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public Ciiu_Emp() {
		
	}
	
	
}
