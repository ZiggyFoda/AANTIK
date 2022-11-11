package com.aantik.demo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Estudiante{
	
	/**
	 * 
	 */
	@Id
    @Column(name = "id")
	private Long id;
	@Column
	private String nombre;
	@Column
	private String correo;
	@Column
	private String telefono;
	@Column
	private String direccion;		
	@Column
	private String asignatura;//CDIO-PSU
	@Column
	private String clase;
	@Column
	private String entidad;		
	@Column
	private String linAccion;			
	@Column
	private Long idEstudiantil;		
	@Column
	private Long identificacion;	
	@Column
	private String tallerSP; //taller sentido de mi practica	
	@Column
	private String fechaSP; //fecha asistencia sentido de mi practica			
	@Column
	private String infografia; //revision de infografia de pasos a seguir
	
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

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getLinAccion() {
		return linAccion;
	}

	public void setLinAccion(String linAccion) {
		this.linAccion = linAccion;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Long getIdEstudiantil() {
		return idEstudiantil;
	}

	public void setIdEstudiantil(Long idEstudiantil) {
		this.idEstudiantil = idEstudiantil;
	}

	public Long getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Long identificacion) {
		this.identificacion = identificacion;
	}

	public String getTallerSP() {
		return tallerSP;
	}

	public void setTallerSP(String tallerSP) {
		this.tallerSP = tallerSP;
	}

	public String getFechaSP() {
		return fechaSP;
	}

	public void setFechaSP(String fechaSP) {
		this.fechaSP = fechaSP;
	}

	public String getInfografia() {
		return infografia;
	}

	public void setInfografia(String infografia) {
		this.infografia = infografia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asignatura == null) ? 0 : asignatura.hashCode());
		result = prime * result + ((clase == null) ? 0 : clase.hashCode());
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((entidad == null) ? 0 : entidad.hashCode());
		result = prime * result + ((fechaSP == null) ? 0 : fechaSP.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idEstudiantil == null) ? 0 : idEstudiantil.hashCode());
		result = prime * result + ((identificacion == null) ? 0 : identificacion.hashCode());
		result = prime * result + ((infografia == null) ? 0 : infografia.hashCode());
		result = prime * result + ((linAccion == null) ? 0 : linAccion.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((tallerSP == null) ? 0 : tallerSP.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		Estudiante other = (Estudiante) obj;
		if (asignatura == null) {
			if (other.asignatura != null)
				return false;
		} else if (!asignatura.equals(other.asignatura))
			return false;
		if (clase == null) {
			if (other.clase != null)
				return false;
		} else if (!clase.equals(other.clase))
			return false;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (entidad == null) {
			if (other.entidad != null)
				return false;
		} else if (!entidad.equals(other.entidad))
			return false;
		if (fechaSP == null) {
			if (other.fechaSP != null)
				return false;
		} else if (!fechaSP.equals(other.fechaSP))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idEstudiantil == null) {
			if (other.idEstudiantil != null)
				return false;
		} else if (!idEstudiantil.equals(other.idEstudiantil))
			return false;
		if (identificacion == null) {
			if (other.identificacion != null)
				return false;
		} else if (!identificacion.equals(other.identificacion))
			return false;
		if (infografia == null) {
			if (other.infografia != null)
				return false;
		} else if (!infografia.equals(other.infografia))
			return false;
		if (linAccion == null) {
			if (other.linAccion != null)
				return false;
		} else if (!linAccion.equals(other.linAccion))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (tallerSP == null) {
			if (other.tallerSP != null)
				return false;
		} else if (!tallerSP.equals(other.tallerSP))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", asignatura=" + asignatura + ", clase=" + clase + ", entidad="
				+ entidad + ", linAccion=" + linAccion + ", idEstudiantil=" + idEstudiantil + ", identificacion="
				+ identificacion + ", tallerSP=" + tallerSP + ", fechaSP=" + fechaSP + ", infografia=" + infografia
				+ ", userId=" + userId + "]";
	}	
	
}
