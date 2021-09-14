package com.example.Ejercicio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("persona")
public class Controlador1 {
    @Autowired
    Personas personas;

    @PostMapping("/addPersona")
    public Persona addPersona(@RequestBody Persona persona ){
        personas.addPersona(persona);
        return  persona;
    }

}
