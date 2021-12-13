package com.salesianostriana.dam.Practica.controller;

import com.salesianostriana.dam.Practica.dto.CreateGasolineraDto;
import com.salesianostriana.dam.Practica.dto.GasolineraDtoConverter;
import com.salesianostriana.dam.Practica.dto.GetGasolineraDto;
import com.salesianostriana.dam.Practica.model.Gasolinera;
import com.salesianostriana.dam.Practica.repository.GasolineraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        gasolineraService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Optional<GetGasolineraDto>> edit(@PathVariable Long id, @Valid @RequestBody CreateGasolineraDto c) {
        return ResponseEntity.ok().body(gasolineraService.findById(id).map(a ->
        {a.setId(id);
            a.setMarca(c.getMarca());
            a.setNombre(c.getNombre());
            a.setUbicacion(c.getUbicacion());
            a.setPrecioGasoilNormal(c.getPrecioGasoilNormal());
            a.setPrecioGasoilEspecial(c.getPrecioGasoilEspecial());
            a.setPrecioGasolina98(c.getPrecioGasolina98());
            a.setPrecioGasolina95Octanos(c.getPrecioGasolina95Octanos());
            a.setServicios(c.getServicios());
            a.setFechaApertura(c.getFechaApertura());
            GetGasolineraDto dto = GasolineraDtoConverter.gasolineraToGetGasolineraDto(a);
            return dto;
        }));
    }
}
