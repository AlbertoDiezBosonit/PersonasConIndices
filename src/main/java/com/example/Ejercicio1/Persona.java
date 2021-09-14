package com.example.Ejercicio1;

public class Persona {
    private String nombre,poblacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }



    private Integer edad;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        //this.id = id; // lo asignaremos nosotros manualmente
    }

    public void setIndice(Integer id){
        this.id=id;
    }

    private Integer id;

}
