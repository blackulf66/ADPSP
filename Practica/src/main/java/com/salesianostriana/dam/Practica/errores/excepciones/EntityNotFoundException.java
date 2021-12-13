package com.salesianostriana.dam.Practica.errores.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)

public class EntityNotFoundException extends RuntimeException{

    public EntityNotFoundException(Long id) {
        super("no encontrado");
    }
}
