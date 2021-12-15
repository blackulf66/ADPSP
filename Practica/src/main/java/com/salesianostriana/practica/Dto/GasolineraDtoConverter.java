package com.salesianostriana.practica.Dto;

import com.salesianostriana.practica.model.Gasolinera;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class GasolineraDtoConverter {

    public Gasolinera createEstacionDtoToEstacion(CreateGasolineraDto c){
        return Gasolinera.builder()
                .id(c.getId())
                .nombre(c.getNombre())
                .marca(c.getMarca())
                .ubicacion(c.getUbicacion())
                .tieneAutolavado(c.isTieneAutolavado())
                .precioGasoilNormal(c.getPrecioGasoilNormal())
                .precioGasoilEspecial(c.getPrecioGasoilEspecial())
                .precioGasolina98(c.getPrecioGasolina98())
                .precioGasolina95Octanos(c.getPrecioGasolina95Octanos())
                .fechaApertura(c.getFechaApertura())
                .servicios(c.getServicios())
                .build();
    }
    public GetGasolineraDto EstacionToGetEstacionDto(Gasolinera g){
        return GetGasolineraDto.builder()
                .id(g.getId())
                .nombre(g.getNombre())
                .marca(g.getMarca())
                .ubicacion(g.getUbicacion())
                .tieneAutolavado(g.isTieneAutolavado())
                .precioGasoilNormal(g.getPrecioGasoilNormal())
                .precioGasoilEspecial(g.getPrecioGasoilEspecial())
                .precioGasolina98(g.getPrecioGasolina98())
                .precioGasolina95Octanos(g.getPrecioGasolina95Octanos())
                .fechaApertura(g.getFechaApertura())
                .servicios(g.getServicios())
                .fechaRegistro(LocalDateTime.now())
                .build();
    }

}
