package com.salesianostriana.dam.Practica.model;

import lombok.*;
import lombok.extern.jbosslog.JBossLog;
import org.springframework.data.auditing.DateTimeProvider;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Gasolinera {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "{producto.nombre.blank}")
    private String nombre;

    private String marca;
    @Lob
    private String ubicacion;

    private Boolean tieneAutoLavado;

    private double precioGasoilNormal;

    private double precioGasolina95Octanos;

    private double precioGasoilEspecial;

    private double precioGasolina98;
    @Lob
    private String servicios;

    private Date fechaApertura;

    public Gasolinera(String nombre, String marca, String ubicacion, double precioGasoilNormal, boolean tieneAutolavado, double precioGasolina95Octanos, double precioGasoilEspecial, double precioGasolina98, String servicios, Date fechaApertura) {
    }
}
