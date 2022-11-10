package com.aantik.demo.entidad;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Noticia{
	
	/**
	 * 
	 */
	@Id
    @Column(name = "id")
	private Long id;
	@Column
	private String titulo;
	@Column
	private String noticia;
	@Column
	private String fuente;
	@Column
	private String encargado;		
	@Column
	private LocalDate fecha;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEncargado() {
		return encargado;
	}

	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((noticia == null) ? 0 : noticia.hashCode());
		result = prime * result + ((encargado == null) ? 0 : encargado.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + ((fuente == null) ? 0 : fuente.hashCode());
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Noticia other = (Noticia) obj;
		if (noticia == null) {
			if (other.noticia != null)
				return false;
		} else if (!noticia.equals(other.noticia))
			return false;
		if (encargado == null) {
			if (other.encargado != null)
				return false;
		} else if (!encargado.equals(other.encargado))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (fuente == null) {
			if (other.fuente != null)
				return false;
		} else if (!fuente.equals(other.fuente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Noticia [id=" + id + ", titulo=" + titulo + ", noticia=" + noticia + ", fuente=" + fuente
				+ ", encargado=" + encargado + ", fecha=" + fecha + "]";
	}	
	
}
