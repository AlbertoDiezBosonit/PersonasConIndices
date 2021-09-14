package com.example.Ejercicio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ejercicio1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Application.class, args);
	}

	@Autowired
	Personas personas;

	@Bean
	public void inicializaPersonas(){
		personas = new Personas();
		System.out.println("Se inicializan las personas");
	}
}
