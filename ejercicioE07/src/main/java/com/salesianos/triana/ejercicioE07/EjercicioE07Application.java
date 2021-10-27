package com.salesianos.triana.ejercicioE07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EjercicioE07Application {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioE07Application.class, args);
	}

}
