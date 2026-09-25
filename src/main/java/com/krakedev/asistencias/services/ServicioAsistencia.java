package com.krakedev.asistencias.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.asistencias.entidades.Asistencia;
import com.krakedev.asistencias.entidades.Estudiante;
import com.krakedev.asistencias.entidades.RegistroAsistencia;

@Service
public class ServicioAsistencia {

	// Guarda todos los registros de asistencia
	private ArrayList<RegistroAsistencia> registros = new ArrayList<>();

	// Permite utilizar el servicio de estudiantes
	private final ServicioEstudiantes servicioEstudiantes;

	// Spring conecta este servicio con ServicioEstudiantes
	public ServicioAsistencia(ServicioEstudiantes servicioEstudiantes) {
		this.servicioEstudiantes = servicioEstudiantes;
	}

	// Registra la asistencia de un estudiante por su cédula
	public RegistroAsistencia registrarAsistencia(String cedula) {

		// Busca al estudiante
		Estudiante estudiante = servicioEstudiantes.buscarPorCedula(cedula);

		// Si no existe, retorna null
		if (estudiante == null) {
			return null;
		}

		// Crea la asistencia con fecha y hora actuales
		Asistencia asistencia = new Asistencia(
				LocalDate.now(),
				LocalDateTime.now(),
				"P"
		);

		// Une estudiante y asistencia
		RegistroAsistencia registro = new RegistroAsistencia(
				estudiante,
				asistencia
		);

		// Guarda el registro
		registros.add(registro);

		// Retorna el registro creado
		return registro;
	}
	// Consulta todas las asistencias de un estudiante
	public ArrayList<Asistencia> consultarAsistencia(String cedula) {

		// Lista donde guardamos las asistencias encontradas
		ArrayList<Asistencia> asistencias = new ArrayList<>();

		// Recorre todos los registros de asistencia
		for (RegistroAsistencia registro : registros) {

			// Compara la cédula del estudiante del registro
			if (registro.getEstudiante().getCedula().equals(cedula)) {

				// Agrega la asistencia encontrada
				asistencias.add(registro.getAsistencia());
			}
		}

		// Retorna todas las asistencias encontradas
		return asistencias;
	}
}