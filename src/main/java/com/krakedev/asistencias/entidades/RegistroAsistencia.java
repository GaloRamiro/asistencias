package com.krakedev.asistencias.entidades;

public class RegistroAsistencia {

	private Estudiante estudiante;
	private Asistencia asistencia;

	// Constructor vacío
	public RegistroAsistencia() {
	}

	// Crea un registro con estudiante y asistencia
	public RegistroAsistencia(Estudiante estudiante, Asistencia asistencia) {
		this.estudiante = estudiante;
		this.asistencia = asistencia;
	}

	// Retorna el estudiante
	public Estudiante getEstudiante() {
		return estudiante;
	}

	// Guarda el estudiante
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	// Retorna la asistencia
	public Asistencia getAsistencia() {
		return asistencia;
	}

	// Guarda la asistencia
	public void setAsistencia(Asistencia asistencia) {
		this.asistencia = asistencia;
	}

	// Muestra los datos del registro
	@Override
	public String toString() {
		return "RegistroAsistencia [estudiante=" + estudiante 
				+ ", asistencia=" + asistencia + "]";
	}
}