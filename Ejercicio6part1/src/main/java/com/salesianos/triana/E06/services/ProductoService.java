package com.salesianos.triana.E06.services;

import com.salesianos.triana.E06.model.Producto;
import com.salesianos.triana.E06.repos.ProductoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoService extends BaseService<Producto,Long, ProductoRepository> {
}
