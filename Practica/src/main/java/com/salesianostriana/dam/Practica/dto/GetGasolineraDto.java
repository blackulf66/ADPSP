package com.salesianostriana.dam.Practica.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetGasolineraDto {

    private Long id;
    private String nombre , marca ,ubicacion ,servicios;
    private boolean tieneAutolavado;
    private Date fechaApertura;
    private double precioGasoilNormal,precioGasolina95Octanos, precioGasoilEspecial, precioGasolina98;


}