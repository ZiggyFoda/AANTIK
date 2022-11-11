package com.aantik.demo.entidad;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Noticia{
	
	/**
	 * 
	 */
	@Id
	@Column
	private String titulo;
	@Column
	private String noticia;
	@Column
	private String fuente;
	@Column
	private String encargado;		
	@Column
	private String fecha;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getNoticia() {
		return noticia;
	}
	public void setNoticia(String noticia) {
		this.noticia = noticia;
	}
	public String getFuente() {
		return fuente;
	}
	public void setFuente(String fuente) {
		this.fuente = fuente;
	}
	public String getEncargado() {
		return encargado;
	}
	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Noticia(String titulo, String noticia, String fuente, String encargado, String fecha) {
		super();
		this.titulo = titulo;
		this.noticia = noticia;
		this.fuente = fuente;
		this.encargado = encargado;
		this.fecha = fecha;
	}

	
}
