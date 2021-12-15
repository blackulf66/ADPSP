package com.salesianostriana.dam.Practica.dto;


import com.salesianostriana.dam.Practica.model.Gasolinera;
import org.springframework.stereotype.Component;

@Component
public class GasolineraDtoConverter {
    public Gasolinera createGasolineraDtotoGasolinera(CreateGasolineraDto c){
        return new Gasolinera(
                c.getNombre(),
                c.getMarca(),
                c.getUbicacion(),
                c.getPrecioGasoilNormal(),
                c.isTieneAutolavado(),
                c.getPrecioGasolina95Octanos(),
                c.getPrecioGasoilEspecial(),
                c.getPrecioGasolina98(),
                c.getServicios(),
                c.getFechaApertura()
        );
    }
    public static GetGasolineraDto gasolineraToGetGasolineraDto(Gasolinera g) {
        return GetGasolineraDto.builder()
                .id(g.getId())
                .nombre(g.getNombre())
                .marca(g.getMarca())
                .ubicacion(g.getUbicacion())
                .precioGasoilEspecial(g.getPrecioGasoilEspecial())
                .precioGasoilNormal(g.getPrecioGasoilNormal())
                .precioGasolina95Octanos(g.getPrecioGasolina95Octanos())
                .precioGasolina98(g.getPrecioGasolina98())
                .tieneAutolavado(g.getTieneAutoLavado())
                .servicios(g.getServicios())
                .fechaApertura(g.getFechaApertura()).build();
    }
}