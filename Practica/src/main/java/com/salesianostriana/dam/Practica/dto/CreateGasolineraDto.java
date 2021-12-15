package com.salesianostriana.dam.Practica.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateGasolineraDto {

    private Long id;
    @NotBlank(message = "{gasolinera.nombre.blank}")
    private String nombre;

    @NotNull
    private String marca;

    @NotBlank(message = "{gasolinera.ubicacion.blank}")
    private String ubicacion;

    private boolean tieneAutolavado;

    private double precioGasoilNormal;

    private double precioGasolina95Octanos;

    private double precioGasoilEspecial;

    private double precioGasolina98;

    @Lob
    private String servicios;

    @Past
    private Date fechaApertura;
}
