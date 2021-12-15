package com.salesianostriana.practica.services;

import com.salesianostriana.practica.errores.excepciones.EntityNotFoundException;
import com.salesianostriana.practica.errores.excepciones.ListEntityNotFoundException;
import com.salesianostriana.practica.model.Gasolinera;
import com.salesianostriana.practica.repository.GasolineraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GasolineraService {

    private final GasolineraRepository gasolineraRepository;

    public List<Gasolinera> findAll() {
        List<Gasolinera> result= gasolineraRepository.findAll();
        if (result.isEmpty()) {
            throw new ListEntityNotFoundException(Gasolinera.class);
        }
        else {
            return result;
        }
    }

    public Optional<Gasolinera> findById(Long id) {
        Optional<Gasolinera> result= gasolineraRepository.findById(id);
        if (result.isEmpty()){
            throw new EntityNotFoundException(id);
        }else{
            return result;
        }
    }

    public Gasolinera save(Gasolinera estacionDeServicio) {
        return gasolineraRepository.save(estacionDeServicio);
    }

    public Gasolinera edit(Gasolinera estacionDeServicio) {

        return gasolineraRepository.save(estacionDeServicio);
    }

    public Optional<Gasolinera> deleteById(Long id) {
        Optional<Gasolinera> result= gasolineraRepository.findById(id);
        if (result.isEmpty()) {
            throw new EntityNotFoundException(id);
        } else {
            return result;
        }
    }
}
