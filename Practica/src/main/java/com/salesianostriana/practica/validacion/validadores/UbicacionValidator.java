package com.salesianostriana.practica.validacion.validadores;

import com.salesianostriana.practica.repository.GasolineraRepository;
import com.salesianostriana.practica.validacion.anotaciones.Ubicacion;
import lombok.RequiredArgsConstructor;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@RequiredArgsConstructor
public class UbicacionValidator implements ConstraintValidator<Ubicacion, String> {

    private final GasolineraRepository estacionServicioRepository;

    @Override
    public void initialize(Ubicacion constraintAnnotation) {
    }

    @Override
    public boolean isValid(String ubicacion, ConstraintValidatorContext constraintValidatorContext) {
        return StringUtils.hasText(ubicacion) && !estacionServicioRepository.existsByUbicacion(ubicacion);
    }

}
