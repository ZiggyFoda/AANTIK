package com.aantik.demo.model;

public class Preinscrito {
	
	private String nombre;
	private String correo;
	private String telefono;
	private String direccion;	
	private String asignatura;//CDIO-PSU
	private Long idEstudiantil;	
	private Long identificacion;
	private String tallerSP; //taller sentido de mi practica	
	private String fechaSP; //fecha asistencia sentido de mi practica			
	private String infografia; //revision de infografia de pasos a seguir
	
	public Preinscrito() {

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
		
}
