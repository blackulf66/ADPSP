package com.salesianostriana.practica.validacion.validadores;

import com.salesianostriana.practica.validacion.anotaciones.AnotacionDate;
import org.springframework.beans.PropertyAccessorFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDateTime;

public class AnotacionDateValidator implements ConstraintValidator<AnotacionDate, Object> {

    private String fechaApertura;
    private String fechaRegistro;


    @Override
    public void initialize(AnotacionDate constraintAnnotation) {
        fechaApertura = constraintAnnotation.fechaApertura();
        fechaRegistro = constraintAnnotation.fechaRegistro();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        LocalDateTime fechaAperturaValue = (LocalDateTime) PropertyAccessorFactory.forBeanPropertyAccess(value).getPropertyValue(String.valueOf(fechaApertura));
        LocalDateTime fechaRegistroValue = (LocalDateTime) PropertyAccessorFactory.forBeanPropertyAccess(value).getPropertyValue(String.valueOf(fechaRegistro));

            int fecha = fechaAperturaValue.compareTo(fechaRegistroValue);
            if (fecha >= 0){
                return false;
            }else{
                return true;
            }

    }
}
