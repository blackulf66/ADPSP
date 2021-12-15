package com.salesianostriana.practica.errores.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntityNotFoundException extends RuntimeException{

    public EntityNotFoundException(Long id){
        super("No se pudo encontrar la estación con la id:" + id);
    }
}
