package com.salesianos.triana.ejercicioE08.repository;

import com.salesianos.triana.ejercicioE08.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}
