package com.krakedev.asistencias.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.asistencias.entidades.Estudiante;

@Service
public class ServicioEstudiantes {

	private ArrayList<Estudiante> estudiantes = new ArrayList<>();

	// Agrega un estudiante si la cédula no está registrada
	public void agregar(Estudiante estudiante) {

		// Busca si ya existe un estudiante con esa cédula
		Estudiante encontrado = buscarPorCedula(estudiante.getCedula());

		// Si no existe, lo agrega a la lista
		if (encontrado == null) {
			estudiantes.add(estudiante);
		}
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

		// Busca el estudiante por la cédula
		Estudiante encontrado = buscarPorCedula(cedula);

		// Si existe, lo elimina de la lista
		if (encontrado != null) {
			estudiantes.remove(encontrado);
		}
	}

	// Actualiza los datos de un estudiante
	public void actualizar(String cedula, Estudiante nuevo) {

		// Busca el estudiante que queremos actualizar
		Estudiante encontrado = buscarPorCedula(cedula);

		// Si existe, cambia sus datos
		if (encontrado != null) {
			encontrado.setNombre(nuevo.getNombre());
			encontrado.setApellido(nuevo.getApellido());
		}
	}

	// Retorna todos los estudiantes
	public ArrayList<Estudiante> listar() {
		return estudiantes;
	}
}