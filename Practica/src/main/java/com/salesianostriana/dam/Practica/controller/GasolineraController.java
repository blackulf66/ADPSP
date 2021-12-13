package com.salesianostriana.dam.Practica.controller;

import com.salesianostriana.dam.Practica.dto.GasolineraDtoConverter;
import com.salesianostriana.dam.Practica.dto.GetGasolineraDto;
import com.salesianostriana.dam.Practica.model.Gasolinera;
import com.salesianostriana.dam.Practica.repository.GasolineraRepository;
import com.salesianostriana.dam.Practica.service.GasolineraService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
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
    public ResponseEntity<GetGasolineraDto> findById(@PathVariable Long id) {

        Optional<Gasolinera> gasolineraBuscada = gasolineraService.findById(id);

        if (gasolineraBuscada.isEmpty())
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok().body(GasolineraDtoConverter.gasolineraToGetGasolineraDto(gasolineraBuscada.get()));
    }

    @PostMapping("/")
    public ResponseEntity<Gasolinera> create(@RequestBody Gasolinera nuevag) {
        if (nuevag.getNombre() == null) {
            return ResponseEntity.badRequest().build();
        } else {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(gasolineraService.save(nuevag));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
            if (gasolineraService.findById(id).isEmpty()) {
                return ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .build();
            } else {
                gasolineraService.deleteById(id);

                return ResponseEntity.status(HttpStatus.OK).build();

            }
    }

}
