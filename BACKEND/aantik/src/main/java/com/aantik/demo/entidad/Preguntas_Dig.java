package com.aantik.demo.entidad;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Preguntas_Dig implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6334374320762591152L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native",strategy="native")
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
	
	@JoinTable(name = "rubrica_preg",
	joinColumns=@JoinColumn(name="id"),
	inverseJoinColumns=@JoinColumn(name="id_rub"))
	private Long id_rub;
	
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