package com.salesianostriana.practica.Dto;

import com.salesianostriana.practica.validacion.anotaciones.Ubicacion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Lob;
import javax.validation.constraints.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor @AllArgsConstructor
public class CreateGasolineraDto {

    private Long id;
    @NotBlank(message = "{gasolinera.nombre.blank}")
    private String nombre;

    @NotNull
    private String marca;

    @NotBlank(message = "{gasolinera.ubicacion.blank}")
    @Ubicacion
    @Pattern(regexp = "^([-+]?\\d{1,2}[.]\\d+),\\s*([-+]?\\d{1,3}[.]\\d+)$", message = "{gasolinera.ubicacion}")
    private String ubicacion;

    private boolean tieneAutolavado = false;

    private double precioGasoilNormal;

    private double precioGasolina95Octanos;

    private double precioGasoilEspecial;

    private double precioGasolina98;

    @Lob
    private String servicios;

    @Past
    private LocalDateTime fechaApertura;

    private LocalDateTime fechaRegistro;
}
