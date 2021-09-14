package com.example.Ejercicio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("persona")
public class Controlador4 {
    @Autowired
    Personas personas;

    @GetMapping("/{id}")
    public Persona retorna(@PathVariable Integer id){
        return personas.retornaPorId(id);
    }

    @GetMapping("/nombre/{nombre}")
    public List<Persona> retorna(@PathVariable String nombre){
        return personas.retornaPorNombre(nombre);
    }
}
