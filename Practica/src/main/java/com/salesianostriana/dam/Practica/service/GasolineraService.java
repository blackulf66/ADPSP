package com.salesianostriana.dam.Practica.service;


import com.salesianostriana.dam.Practica.errores.excepciones.ListEntityNotFoundException;
import com.salesianostriana.dam.Practica.model.Gasolinera;
import com.salesianostriana.dam.Practica.repository.GasolineraRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GasolineraService {

    private GasolineraRepository gasolineraRepository;

    public List<Gasolinera> findAll() {
        List<Gasolinera> result = gasolineraRepository.findAll();

        if (result.isEmpty()) {
            throw new ListEntityNotFoundException(Gasolinera.class);
        } else {
            return result;
        }
    }
}
