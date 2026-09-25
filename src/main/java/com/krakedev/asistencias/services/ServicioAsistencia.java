package com.krakedev.asistencias.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.asistencias.entidades.RegistroAsistencia;

@Service
public class ServicioAsistencia {

	// Guarda todos los registros de asistencia
	private ArrayList<RegistroAsistencia> registros = new ArrayList<>();

	// Permite usar el servicio de estudiantes
	private final ServicioEstudiantes servicioEstudiantes;

	// Spring inyecta ServicioEstudiantes mediante el constructor
	public ServicioAsistencia(ServicioEstudiantes servicioEstudiantes) {
		this.servicioEstudiantes = servicioEstudiantes;
	}
}