package com.salesianos.triana.ejercicioE08.repository;

import com.salesianos.triana.ejercicioE08.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
