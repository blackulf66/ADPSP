package com.salesianostriana.practica.controller;

import com.salesianostriana.practica.Dto.CreateGasolineraDto;
import com.salesianostriana.practica.model.Gasolinera;
import com.salesianostriana.practica.Dto.GasolineraDtoConverter;
import com.salesianostriana.practica.Dto.GetGasolineraDto;
import com.salesianostriana.practica.services.GasolineraService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/gasolinera")
public class GasolineraController {

    private final GasolineraService gasolineraService;
    private final GasolineraDtoConverter gasolineraDtoConverter;

    @GetMapping("/")
    public ResponseEntity<List<Gasolinera>> findAll(){
            return ResponseEntity.ok().body(gasolineraService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<GetGasolineraDto> findOne(@PathVariable Long id){
        return ResponseEntity.ok().body(gasolineraDtoConverter.EstacionToGetEstacionDto(gasolineraService.findById(id).get()));
    }
    @PostMapping("/")
    public ResponseEntity<GetGasolineraDto> save(@Valid @RequestBody CreateGasolineraDto c){
        Gasolinera estacion = gasolineraDtoConverter.createEstacionDtoToEstacion(c);
        gasolineraService.save(estacion);
        GetGasolineraDto estacionDto = gasolineraDtoConverter.EstacionToGetEstacionDto(estacion);
        return ResponseEntity.status(HttpStatus.CREATED).body(estacionDto);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        gasolineraService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Optional<GetGasolineraDto>> edit(@PathVariable Long id, @Valid @RequestBody CreateGasolineraDto c) {
        return ResponseEntity.ok().body(gasolineraService.findById(id).map(e ->
        {e.setId(id);
            e.setMarca(c.getMarca());
            e.setNombre(c.getNombre());
            e.setUbicacion(c.getUbicacion());
            e.setTieneAutolavado(c.isTieneAutolavado());
            e.setPrecioGasoilNormal(c.getPrecioGasoilNormal());
            e.setPrecioGasoilEspecial(c.getPrecioGasoilEspecial());
            e.setPrecioGasolina98(c.getPrecioGasolina98());
            e.setPrecioGasolina95Octanos(c.getPrecioGasolina95Octanos());
            e.setServicios(c.getServicios());
            e.setFechaApertura(c.getFechaApertura());
            gasolineraService.save(e);
            GetGasolineraDto dto = gasolineraDtoConverter.EstacionToGetEstacionDto(e);
                return dto;
        }));
        }
}
