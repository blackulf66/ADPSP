package com.salesianostriana.dam.Practica.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateGasolineraDto {

    private String nombre , marca ,ubicacion ,servicios;
    private boolean tieneAutolavado;
    private Date fechaApertura;
    private double precioGasoilNormal,precioGasolina95Octanos, precioGasoilEspecial, precioGasolina98;
}
