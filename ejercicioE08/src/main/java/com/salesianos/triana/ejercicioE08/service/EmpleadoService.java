package com.salesianos.triana.ejercicioE08.service;

import com.salesianos.triana.ejercicioE08.models.Empleado;
import com.salesianos.triana.ejercicioE08.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService extends BaseService<Empleado,Long, EmpleadoRepository> {
}
