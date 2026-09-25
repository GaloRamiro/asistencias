
package com.krakedev.asistencias.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.asistencias.entidades.Asistencia;
import com.krakedev.asistencias.entidades.RegistroAsistencia;
import com.krakedev.asistencias.services.ServicioAsistencia;

@RestController
@RequestMapping("/asistencias")
public class ControladorAsistencia {

	// Servicio que contiene la lógica de asistencias
	private final ServicioAsistencia servicioAsistencia;

	// Spring inyecta el servicio mediante el constructor
	public ControladorAsistencia(ServicioAsistencia servicioAsistencia) {
		this.servicioAsistencia = servicioAsistencia;
	}

	// Registra la asistencia de un estudiante
	@PostMapping("/{cedula}")
	public RegistroAsistencia registrarAsistencia(@PathVariable String cedula) {
		return servicioAsistencia.registrarAsistencia(cedula);
	}

	// Consulta todas las asistencias de un estudiante
	@GetMapping("/{cedula}")
	public ArrayList<Asistencia> consultarAsistencia(@PathVariable String cedula) {
		return servicioAsistencia.consultarAsistencia(cedula);
	}
}
