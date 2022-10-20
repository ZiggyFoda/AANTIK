package com.aantik.demo.entidad;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class RedTejido implements Serializable{
	
	private static final long serialVersionUID = 6726922550147191349L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="emprenOrigen_id", nullable=false)
	private CIIU emprenOrigen;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="emprenDest_id", nullable=false)
	private CIIU emprenDest;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CIIU getEmprenOrigen() {
		return emprenOrigen;
	}

	public void setEmprenOrigen(CIIU emprenOrigen) {
		this.emprenOrigen = emprenOrigen;
	}

	public CIIU getEmprenDest() {
		return emprenDest;
	}

	public void setEmprenDest(CIIU emprenDest) {
		this.emprenDest = emprenDest;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emprenDest == null) ? 0 : emprenDest.hashCode());
		result = prime * result + ((emprenOrigen == null) ? 0 : emprenOrigen.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		RedTejido other = (RedTejido) obj;
		if (emprenDest == null) {
			if (other.emprenDest != null)
				return false;
		} else if (!emprenDest.equals(other.emprenDest))
			return false;
		if (emprenOrigen == null) {
			if (other.emprenOrigen != null)
				return false;
		} else if (!emprenOrigen.equals(other.emprenOrigen))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RedTejido [id=" + id + ", emprenOrigen=" + emprenOrigen + ", emprenDest=" + emprenDest + "]";
	}
	
	
}
