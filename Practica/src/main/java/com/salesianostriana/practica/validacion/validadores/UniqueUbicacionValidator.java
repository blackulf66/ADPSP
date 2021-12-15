package com.salesianostriana.practica.validacion.validadores;

import com.salesianostriana.practica.repository.GasolineraRepository;
import com.salesianostriana.practica.validacion.anotaciones.UniqueUbicacion;
import lombok.RequiredArgsConstructor;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@RequiredArgsConstructor
public class UniqueUbicacionValidator implements ConstraintValidator<UniqueUbicacion, String> {

    private final GasolineraRepository estacionServicioRepository;

    @Override
    public void initialize(UniqueUbicacion constraintAnnotation) {
    }

    @Override
    public boolean isValid(String ubicacion, ConstraintValidatorContext constraintValidatorContext) {
        return StringUtils.hasText(ubicacion) && !estacionServicioRepository.existsByUbicacion(ubicacion);
    }

}
