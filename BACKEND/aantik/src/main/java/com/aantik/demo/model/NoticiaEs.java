package com.aantik.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(	name = "noticia")

public class NoticiaEs {
	

	
	@Id
	private String titulo;
    private String noticia;
    private String fuente;   
    private String fecha; 
    private String encargado; 
    @Email
    private String correo; 
    
    public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getEncargado() {
		return encargado;
	}
	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}
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
	public NoticiaEs(String titulo, String noticia, String fuente, String fecha, String encargado, String correo) {
		super();
		this.titulo = titulo;
		this.noticia = noticia;
		this.fuente = fuente;
		this.fecha = fecha;
		this.encargado = encargado;
		this.correo = correo;
	}
	public NoticiaEs() {

	}


    

}
