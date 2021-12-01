package com.salesianos.triana.ejercicioE08.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class ClienteIndividual extends Cliente{

    private String cupon;

    private String nombreUsuario;

    private int codigoPostal;


}
