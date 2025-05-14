package com.academico.titulos.dtos;

public class TituloDto {
    private String nombreEstudiante;
    private String carrera;

    // Constructor
    public TituloDto(String nombreEstudiante, String carrera) {
        this.nombreEstudiante = nombreEstudiante;
        this.carrera = carrera;
    }

    // Getters y Setters
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
