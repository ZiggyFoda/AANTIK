package com.aantik.demo.entidad;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Profesor{
	
	/**
	 * 
	 */
	@Id
	private Long id;
	@Column
	private String nombre;
	@Column
	private String vinculacion;
	@Column
	private String titulo;
	@Column
	private String especialidad;
	@Column
	private String asignatura;
	@Column
	private String telefono;
	@Column
	private String correo;
	@Column
	private String oficina;
	@Column
	private String direcRes;
	@Column
	private String localidad;
	@Column
	private String sectoEc;
	@Column
	private String HisAse;
	@Column
	private String contacto;//medio de comunicacion que prefiere**
	@Column
	private String lineaAc;//**p
	@Column
	private String secEco2;//**
	@Column
	private String tipoOS;
	@Column
	private String horarioNotif;
	@Column
	private String horarioAtencion;
	@Column
	private String NOdisponibilidad;
	@Column
	private boolean limitacion;
		
	@JoinTable(name = "profesor_user",
			joinColumns=@JoinColumn(name="profesor_id"),
			inverseJoinColumns=@JoinColumn(name="user_id"))
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

	public String getVinculacion() {
		return vinculacion;
	}

	public void setVinculacion(String vinculacion) {
		this.vinculacion = vinculacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

	public String getDirecRes() {
		return direcRes;
	}

	public void setDirecRes(String direcRes) {
		this.direcRes = direcRes;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getSectoEc() {
		return sectoEc;
	}

	public void setSectoEc(String sectoEc) {
		this.sectoEc = sectoEc;
	}

	public String getHisAse() {
		return HisAse;
	}

	public void setHisAse(String hisAse) {
		HisAse = hisAse;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getLineaAc() {
		return lineaAc;
	}

	public void setLineaAc(String lineaAc) {
		this.lineaAc = lineaAc;
	}

	public String getSecEco2() {
		return secEco2;
	}

	public void setSecEco2(String secEco2) {
		this.secEco2 = secEco2;
	}

	public String getTipoOS() {
		return tipoOS;
	}

	public void setTipoOS(String tipoOS) {
		this.tipoOS = tipoOS;
	}

	public String getHorarioNotif() {
		return horarioNotif;
	}

	public void setHorarioNotif(String horarioNotif) {
		this.horarioNotif = horarioNotif;
	}

	public String getHorarioAtencion() {
		return horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public String getNOdisponibilidad() {
		return NOdisponibilidad;
	}

	public void setNOdisponibilidad(String nOdisponibilidad) {
		NOdisponibilidad = nOdisponibilidad;
	}

	public boolean isLimitacion() {
		return limitacion;
	}

	public void setLimitacion(boolean limitacion) {
		this.limitacion = limitacion;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(HisAse, NOdisponibilidad, asignatura, contacto, correo, direcRes, especialidad,
				horarioAtencion, horarioNotif, id, limitacion, lineaAc, localidad, nombre, oficina, secEco2, sectoEc,
				telefono, tipoOS, titulo, userId, vinculacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		return Objects.equals(HisAse, other.HisAse) && Objects.equals(NOdisponibilidad, other.NOdisponibilidad)
				&& Objects.equals(asignatura, other.asignatura) && Objects.equals(contacto, other.contacto)
				&& Objects.equals(correo, other.correo) && Objects.equals(direcRes, other.direcRes)
				&& Objects.equals(especialidad, other.especialidad)
				&& Objects.equals(horarioAtencion, other.horarioAtencion)
				&& Objects.equals(horarioNotif, other.horarioNotif) && Objects.equals(id, other.id)
				&& limitacion == other.limitacion && Objects.equals(lineaAc, other.lineaAc)
				&& Objects.equals(localidad, other.localidad) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(oficina, other.oficina) && Objects.equals(secEco2, other.secEco2)
				&& Objects.equals(sectoEc, other.sectoEc) && Objects.equals(telefono, other.telefono)
				&& Objects.equals(tipoOS, other.tipoOS) && Objects.equals(titulo, other.titulo)
				&& Objects.equals(userId, other.userId) && Objects.equals(vinculacion, other.vinculacion);
	}

	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", vinculacion=" + vinculacion + ", titulo=" + titulo
				+ ", especialidad=" + especialidad + ", asignatura=" + asignatura + ", telefono=" + telefono
				+ ", correo=" + correo + ", oficina=" + oficina + ", direcRes=" + direcRes + ", localidad=" + localidad
				+ ", sectoEc=" + sectoEc + ", HisAse=" + HisAse + ", contacto=" + contacto + ", lineaAc=" + lineaAc
				+ ", secEco2=" + secEco2 + ", tipoOS=" + tipoOS + ", horarioNotif=" + horarioNotif
				+ ", horarioAtencion=" + horarioAtencion + ", NOdisponibilidad=" + NOdisponibilidad + ", limitacion="
				+ limitacion + ", userId=" + userId + "]";
	}
	
	


}
