package com.salesianostriana.dam.Practica.service;

import com.salesianostriana.dam.Practica.errores.excepciones.EntityNotFoundException;
import com.salesianostriana.dam.Practica.errores.excepciones.ListEntityNotFoundException;
import com.salesianostriana.dam.Practica.errores.excepciones.SingleEntityNotFoundException;
import com.salesianostriana.dam.Practica.model.Gasolinera;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GasolineraService {

    private GasolineraService gasolineraRepository;

    public List<Gasolinera> findAll() {
        List<Gasolinera> result = gasolineraRepository.findAll();
        if (result.isEmpty()) {
            throw new ListEntityNotFoundException(Gasolinera.class);
        } else {
            return result;
        }
    }

    public List<Gasolinera> findById(Long id) {
        List<Gasolinera> result = gasolineraRepository.findAll();
        if (result.isEmpty()){
            throw new SingleEntityNotFoundException(id.toString(), Gasolinera.class);
        }else{
            return result;
        }
    }
    public Gasolinera save(Gasolinera gasgas) {
        return gasolineraRepository.save(gasgas);
    }

    public void deleteById(Long id) {
        if (gasolineraRepository.findById(id).isEmpty()) {
            throw new SingleEntityNotFoundException(id.toString(), Gasolinera.class);
        } else {
            gasolineraRepository.deleteById(id);
        }
    }

}

