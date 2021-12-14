package com.salesianostriana.dam.Practica.service;

import com.salesianostriana.dam.Practica.errores.excepciones.EntityNotFoundException;
import com.salesianostriana.dam.Practica.errores.excepciones.ListEntityNotFoundException;
import com.salesianostriana.dam.Practica.model.Gasolinera;
import com.salesianostriana.dam.Practica.repository.GasolineraRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<Gasolinera> findById(Long id) {
        if (gasolineraRepository.findById(id).isEmpty()){
            throw new EntityNotFoundException(id);
        }else{
            return this.gasolineraRepository.findById(id);
        }
    }
    public Gasolinera save(Gasolinera gasgas) {
        return gasolineraRepository.save(gasgas);
    }

    public void deleteById(Long id) {
        if (gasolineraRepository.findById(id).isEmpty()) {
            throw new EntityNotFoundException(id);
        } else {
            gasolineraRepository.deleteById(id);
        }
    }

}

