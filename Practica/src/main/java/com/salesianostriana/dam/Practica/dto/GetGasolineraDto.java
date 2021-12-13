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

    public GetGasolineraDto(String nombre, String marca, String ubicacion, String servicios, boolean tieneAutolavado, Date fechaApertura, double precioGasoilNormal, double precioGasolina95Octanos, double precioGasoilEspecial, double precioGasolina98) {
        this.nombre = nombre;
        this.marca = marca;
        this.ubicacion = ubicacion;
        this.servicios = servicios;
        this.tieneAutolavado = tieneAutolavado;
        this.fechaApertura = fechaApertura;
        this.precioGasoilNormal = precioGasoilNormal;
        this.precioGasolina95Octanos = precioGasolina95Octanos;
        this.precioGasoilEspecial = precioGasoilEspecial;
        this.precioGasolina98 = precioGasolina98;
    }
}