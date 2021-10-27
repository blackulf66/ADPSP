package com.salesianos.triana.ejercicioE08.service;

import com.salesianos.triana.ejercicioE08.models.Cliente;
import com.salesianos.triana.ejercicioE08.repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService extends BaseService<Cliente,Long , ClienteRepository>{
}
