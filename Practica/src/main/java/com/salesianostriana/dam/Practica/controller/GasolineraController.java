package com.salesianostriana.dam.Practica.controller;

import com.salesianostriana.dam.Practica.model.Gasolinera;
import com.salesianostriana.dam.Practica.repository.GasolineraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/gasolinera")
public class GasolineraController {

    private final GasolineraRepository gasolineraService;

    @GetMapping("/")
    public List<Gasolinera> todos() {
        return gasolineraService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Gasolinera> uno(@PathVariable Long id) {
        return gasolineraService.findById(id);
    }

    @PostMapping("/")
    public Gasolinera crear(@Valid @RequestBody Gasolinera gasgas) {
        return gasolineraService.save(gasgas);
    }
    @DeleteMapping("/{id}")
    public Optional<Gasolinera> eliminar(@PathVariable Long id){
        return gasolineraService.deleteById(id);
    }

}
