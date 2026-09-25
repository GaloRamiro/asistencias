package com.krakedev.asistencias.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.asistencias.services.ServicioEstudiantes;

@RestController
@RequestMapping("/estudiantes")
public class ControladorEstudiantes {

	// Servicio que contiene la lógica de estudiantes
	private final ServicioEstudiantes servicioEstudiantes;

	// Spring inyecta el servicio mediante el constructor
	public ControladorEstudiantes(ServicioEstudiantes servicioEstudiantes) {
		this.servicioEstudiantes = servicioEstudiantes;
	}
}