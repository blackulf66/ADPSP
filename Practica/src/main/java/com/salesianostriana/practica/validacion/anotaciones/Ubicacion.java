package com.salesianostriana.practica.validacion.anotaciones;

import com.salesianostriana.practica.validacion.validadores.UbicacionValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Constraint(validatedBy = UbicacionValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Ubicacion {

    String message() default "No puede haber 2 ubicaciones iguales";

    Class <?> [] groups() default {};
    Class <? extends Payload> [] payload() default {};
}
