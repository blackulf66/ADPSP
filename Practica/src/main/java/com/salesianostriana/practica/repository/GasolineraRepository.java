package com.salesianostriana.practica.repository;

import com.salesianostriana.practica.model.Gasolinera;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GasolineraRepository extends JpaRepository<Gasolinera, Long> {

    boolean existsByUbicacion(String ubicacion);
}
