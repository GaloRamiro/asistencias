package com.krakedev.asistencias.entidades;

public class Estudiante {

	private String cedula;
	private String nombre;
	private String apellido;

	// Constructor vacío
	public Estudiante() {
	}

	// Constructor con todos los datos
	public Estudiante(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// Retorna la cédula del estudiante
	public String getCedula() {
		return cedula;
	}

	// Guarda la cédula del estudiante
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	// Retorna el nombre
	public String getNombre() {
		return nombre;
	}

	// Guarda el nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Retorna el apellido
	public String getApellido() {
		return apellido;
	}

	// Guarda el apellido
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Estudiante [cedula=" + cedula + ", nombre=" + nombre
				+ ", apellido=" + apellido + "]";
	}
}