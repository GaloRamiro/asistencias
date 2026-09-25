package com.krakedev.asistencias.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.asistencias.entidades.Estudiante;
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

	// Crea un nuevo estudiante
	@PostMapping
	public void agregar(@RequestBody Estudiante estudiante) {
		servicioEstudiantes.agregar(estudiante);
	}

	// Lista todos los estudiantes
	@GetMapping
	public ArrayList<Estudiante> listar() {
		return servicioEstudiantes.listar();
	}

	// Busca un estudiante por su cédula
	@GetMapping("/{cedula}")
	public Estudiante buscarPorCedula(@PathVariable String cedula) {
		return servicioEstudiantes.buscarPorCedula(cedula);
	}

	// Actualiza un estudiante por su cédula
	@PutMapping("/{cedula}")
	public void actualizar(
			@PathVariable String cedula,
			@RequestBody Estudiante estudiante) {

		servicioEstudiantes.actualizar(cedula, estudiante);
	}

	// Elimina un estudiante por su cédula
	@DeleteMapping("/{cedula}")
	public void eliminar(@PathVariable String cedula) {
		servicioEstudiantes.eliminar(cedula);
	}
}