package com.krakedev.asistencias.entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Asistencia {

	private LocalDate fechaClase;
	private LocalDateTime fechaHoraRegistro;
	private String estado;

	// Constructor vacío para crear una asistencia
	public Asistencia() {
	}

	// Constructor para crear una asistencia con todos sus datos
	public Asistencia(LocalDate fechaClase, LocalDateTime fechaHoraRegistro, String estado) {
		this.fechaClase = fechaClase;
		this.fechaHoraRegistro = fechaHoraRegistro;
		this.estado = estado;
	}

	// Retorna la fecha de la clase
	public LocalDate getFechaClase() {
		return fechaClase;
	}

	// Guarda la fecha de la clase
	public void setFechaClase(LocalDate fechaClase) {
		this.fechaClase = fechaClase;
	}

	// Retorna la fecha y hora del registro
	public LocalDateTime getFechaHoraRegistro() {
		return fechaHoraRegistro;
	}

	// Guarda la fecha y hora del registro
	public void setFechaHoraRegistro(LocalDateTime fechaHoraRegistro) {
		this.fechaHoraRegistro = fechaHoraRegistro;
	}

	// Retorna el estado de la asistencia
	public String getEstado() {
		return estado;
	}

	// Guarda P = presente o A = ausente
	public void setEstado(String estado) {
		this.estado = estado;
	}

	// Muestra los datos de la asistencia
	@Override
	public String toString() {
		return "Asistencia [fechaClase=" + fechaClase 
				+ ", fechaHoraRegistro=" + fechaHoraRegistro 
				+ ", estado=" + estado + "]";
	}
}