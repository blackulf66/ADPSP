package com.salesianos.triana.ejercicioE08.repository;

import com.salesianos.triana.ejercicioE08.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
