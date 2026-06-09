package com.example.api_ejemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/tareas")
@SpringBootApplication
public class ApiEjemploApplication {
	// Base de datos en memoria para almacenar las tareas
	private List<String> tareas = new ArrayList<>();

	// Endpoint para agregar una tarea GET: http://localhost:8080/api/tareas/agregar?tarea=Comprar%20leche
	@GetMapping
	public List<String> obtenerTarea() {
		return tareas;
	}

	// Endpoint POST: http://localhost:8080/api/tareas
    @PostMapping
    public String agregarTarea(@RequestBody String nuevaTarea) {
        tareas.add(nuevaTarea);
        return "Tarea agregada: " + nuevaTarea;
    }

	public static void main(String[] args) {
		SpringApplication.run(ApiEjemploApplication.class, args);
	}

}
