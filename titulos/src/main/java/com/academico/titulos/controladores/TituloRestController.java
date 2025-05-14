package com.academico.titulos.controladores;

import org.springframework.web.bind.annotation.RestController;
import com.academico.titulos.dtos.TituloDto;

import io.swagger.v3.oas.annotations.Operation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/titulos")
public class TituloRestController {
    // Lista en memoria para almacenar los títulos
    private final List<TituloDto> titulos = new ArrayList<>();

    // Constructor para inicializar datos de ejemplo
    public TituloRestController() {
        titulos.add(new TituloDto("Juan Perez", "Ingeniería de Sistemas"));
        titulos.add(new TituloDto("Maria Lopez", "Medicina"));
        titulos.add(new TituloDto("Carlos Gomez", "Derecho"));
    }


    // Obtener todos los títulos
    @GetMapping("/")
    @Operation(summary = "Obtener todos los titulos")
    public List<TituloDto> getAllTitulos() {
        System.out.println("Obteniendo todos los títulos");
        return titulos;
    }

    // Obtener un título por índice
    @GetMapping("/{id}")
    public TituloDto getTitulo(@PathVariable int id) {
        if (id >= 0 && id < titulos.size()) {
            return titulos.get(id);
        }
        throw new IllegalArgumentException("ID no válido");
    }
}
