package com.example.Ejercicio1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona")
public class Controlador3 {
    @Autowired
    Personas personas;

    @DeleteMapping("/{id}")
    public String borraPersona(@PathVariable Integer id) {
        String retorno = personas.retornaPorId(id).getNombre();
        personas.eliminarPersona(id);
        return retorno;
    }

}
