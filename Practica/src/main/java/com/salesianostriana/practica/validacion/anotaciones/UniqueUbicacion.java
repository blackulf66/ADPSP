package com.salesianostriana.practica.validacion.anotaciones;

import com.salesianostriana.practica.validacion.validadores.UniqueUbicacionValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Constraint(validatedBy = UniqueUbicacionValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UniqueUbicacion {

    String message() default "No puede haber 2 ubicaciones iguales";

    Class <?> [] groups() default {};
    Class <? extends Payload> [] payload() default {};
}
