package com.academico.titulos.dtos;

public class TituloDto {
<<<<<<< HEAD
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
=======
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
>>>>>>> ea92841ad6fac247b13b60b94d812f2db1c4ec81
    }

    public String getCarrera() {
        return carrera;
    }
<<<<<<< HEAD
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
 
}







=======

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
>>>>>>> ea92841ad6fac247b13b60b94d812f2db1c4ec81
