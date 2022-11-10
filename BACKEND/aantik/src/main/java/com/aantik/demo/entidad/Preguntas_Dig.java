package com.aantik.demo.entidad;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Preguntas_Dig {
	@Id
    @Column(name = "id")
	private Long id;
	@Column
	private  String codigo;
	@Column
	private  String pregunta;
	@Column
	private  String insump;
	@Column
	private String automatica;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public String getInsump() {
		return insump;
	}
	public void setInsump(String insump) {
		this.insump = insump;
	}
	public String getAutomatica() {
		return automatica;
	}
	public void setAutomatica(String automatica) {
		this.automatica = automatica;
	}
	@Override
	public int hashCode() {
		return Objects.hash(automatica, codigo, id, insump, pregunta);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Preguntas_Dig other = (Preguntas_Dig) obj;
		return Objects.equals(automatica, other.automatica) && Objects.equals(codigo, other.codigo)
				&& Objects.equals(id, other.id) && Objects.equals(insump, other.insump)
				&& Objects.equals(pregunta, other.pregunta);
	}
	@Override
	public String toString() {
		return "Preguntas_Dig [id=" + id + ", codigo=" + codigo + ", pregunta=" + pregunta + ", insump=" + insump
				+ ", automatica=" + automatica + "]";
	}
	
	
}
