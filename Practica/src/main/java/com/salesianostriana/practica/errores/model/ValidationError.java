package com.salesianostriana.practica.errores.model;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class ValidationError extends ApiSubError {

    private String objeto, campo,mensaje;
    private Object ValorRechazado;
}
