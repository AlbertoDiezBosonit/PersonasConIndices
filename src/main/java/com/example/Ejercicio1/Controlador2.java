package com.example.Ejercicio1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("persona")
public class Controlador2 {
    @Autowired
    Personas personas;

    @PutMapping("/{id}")
    public Persona actualizar(@PathVariable("id") Integer id, @RequestBody Persona persona) {
        personas.modificaPersona(id,persona.getNombre(),persona.getEdad(),persona.getPoblacion());
        return personas.retornaPorId(id);
    }

}
