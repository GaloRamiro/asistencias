package com.krakedev.asistencias.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.asistencias.entidades.Estudiante;

@Service
public class ServicioEstudiantes {

	private ArrayList<Estudiante> estudiantes = new ArrayList<>();

	// Agrega un estudiante y no permite cédulas duplicadas
	public void agregar(Estudiante estudiante) {
	}

	// Busca un estudiante por su cédula
	public Estudiante buscarPorCedula(String cedula) {

		// Recorre todos los estudiantes guardados
		for (Estudiante estudiante : estudiantes) {

			// Compara la cédula del estudiante con la cédula buscada
			if (estudiante.getCedula().equals(cedula)) {
				return estudiante;
			}
		}

		// Si no encuentra al estudiante retorna null
		return null;
	}

	// Elimina un estudiante usando su cédula
	public void eliminar(String cedula) {
	}

	// Actualiza los datos de un estudiante
	public void actualizar(String cedula, Estudiante nuevo) {
	}

	// Retorna todos los estudiantes
	public ArrayList<Estudiante> listar() {
		return estudiantes;
	}
}