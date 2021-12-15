package com.salesianostriana.practica.validacion.anotaciones;

import com.salesianostriana.practica.validacion.validadores.AnotacionDateValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AnotacionDateValidator.class)
@Documented
public @interface AnotacionDate {

    String message() default "NO";
    Class <?> [] groups() default {};
    Class <? extends Payload> [] payload() default {};

    String fechaApertura();
    String fechaRegistro();
}


