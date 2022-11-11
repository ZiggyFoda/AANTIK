package com.aantik.demo.entidad;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rubrica_preg_dg {

	@Id
    @Column(name = "id")
	private Long id;
	@Column
	private  int cuanti;
	@Column
	private  String rubrica;
	@Column
	private  String actividad;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getCuanti() {
		return cuanti;
	}
	public void setCuanti(int cuanti) {
		this.cuanti = cuanti;
	}
	public String getRubrica() {
		return rubrica;
	}
	public void setRubrica(String rubrica) {
		this.rubrica = rubrica;
	}
	public String getActividad() {
		return actividad;
	}
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	@Override
	public int hashCode() {
		return Objects.hash(actividad, cuanti, id, rubrica);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rubrica_preg_dg other = (Rubrica_preg_dg) obj;
		return Objects.equals(actividad, other.actividad) && cuanti == other.cuanti && Objects.equals(id, other.id)
				&& Objects.equals(rubrica, other.rubrica);
	}
	@Override
	public String toString() {
		return "Rubrica_preg_dg [id=" + id + ", cuanti=" + cuanti + ", rubrica=" + rubrica + ", actividad=" + actividad
				+ "]";
	}
	
	
}
