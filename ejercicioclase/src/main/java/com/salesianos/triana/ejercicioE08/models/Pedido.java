package com.salesianos.triana.ejercicioE08.models;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.websocket.server.ServerEndpoint;

@Entity
@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
@Builder
public class Pedido {

    @Id
    @GeneratedValue
    private Long id;

}
