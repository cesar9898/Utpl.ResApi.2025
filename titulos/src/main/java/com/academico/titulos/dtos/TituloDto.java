package com.academico.titulos.dtos;

public class TituloDto {
    private Long id;
    private String nombre;
    private String descripcion;
    private String carrera;
    // Duplicate field removed

    // Constructor
    public TituloDto(Long id, String nombre, String descripcion, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.carrera = carrera;
        
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
 
}







