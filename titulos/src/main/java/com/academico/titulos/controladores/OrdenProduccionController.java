package com.academico.titulos.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academico.titulos.dtos.TituloDto;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/titulos")
public class OrdenProduccionController {

    // Método GET que devuelve "Hola Mundo"
    private final List<TituloDto> titulos = List.of(
            new TituloDto(1L, "Ingeniería en Sistemas", "Descripción de Ingeniería en Sistemas", "Sistemas"),
            new TituloDto(2L, "Ingeniería Civil", "Descripción de Ingeniería Civil", "Civil"),
            new TituloDto(3L, "Arquitectura", "Descripción de Arquitectura", "Arquitectura"),
            new TituloDto(4L, "Ingeniería Electrónica", "Descripción de Ingeniería Electrónica", "Electrónica"),
            new TituloDto(5L, "Ingeniería Mecánica", "Descripción de Ingeniería Mecánica", "Mecánica"));

    @GetMapping("/hola")
    public String obtenerHolaMundo() {
        return "Hola Mundo";
    }

    @GetMapping("/")
    public List<TituloDto> obtenerTitulos() {
        return titulos;
    }

    // Método GET que devuelve un título por su ID
    @GetMapping("/{id}")
    public TituloDto obtenerTituloPorId(@PathVariable Long id) {
        System.out.println("ID recibido: " + id);
        // Filtrar la lista de títulos para encontrar el que coincide con el ID
        // y devolverlo
        for (TituloDto item : titulos) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        // Si no se encuentra el título, devolver null o lanzar una excepción
        // dependiendo de cómo quieras manejarlo
        return null; // O lanzar una excepción personalizada

    }
}
