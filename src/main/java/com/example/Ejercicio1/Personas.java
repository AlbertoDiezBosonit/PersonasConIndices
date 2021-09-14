package com.example.Ejercicio1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Personas {
    List<Persona> personas;
    int maxIndice;

    public Personas(){
        this.personas=new ArrayList<>();
        maxIndice=0;
    }

    public int addPersona(Persona p){
        p.setIndice(maxIndice);
        maxIndice++;
        this.personas.add(p);
        return maxIndice-1;
    }

    public void modificaPersona(int i, String nombre, Integer edad, String poblacion){
        Persona p = this.retornaPorId(i);
        if(p!=null){
            if (nombre != null)
                this.personas.get(i).setNombre(nombre);
            if (edad != null)
                this.personas.get(i).setEdad(edad);
            if (poblacion != null)
                this.personas.get(i).setPoblacion(poblacion);
        }
    }

    public boolean eliminarPersona(Integer id){
        if(id != null){
            Persona p = this.retornaPorId(id);
            if(p!=null) {
                this.personas.remove(p);
                return true;
            }
        }
        return false;
    }

    public Persona retornaPorId(int id){
        List<Persona> lista = this.personas.stream().filter(p->(p.getId()==id)).collect(Collectors.toList());
        if(lista.size()>0)
            return lista.get(0); // en principio solo habra uno
        return null;
    }

    public List<Persona> retornaPorNombre(String nombre) {
        List<Persona> lista= this.personas.stream().filter(p->(p.getNombre().equals(nombre))).collect(Collectors.toList());
        return lista; // puede estar vacia
    }
}
