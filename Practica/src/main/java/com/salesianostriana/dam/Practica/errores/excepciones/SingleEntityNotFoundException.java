package com.salesianostriana.dam.Practica.errores.excepciones;


public class SingleEntityNotFoundException extends EntityNotFoundException {

    public SingleEntityNotFoundException (String id ,Class clase){
        super(String.format("No se puede encontrar la lista de %s",clase.getName()));
    }
}