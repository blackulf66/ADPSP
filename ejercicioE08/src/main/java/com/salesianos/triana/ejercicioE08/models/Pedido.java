package com.salesianos.triana.ejercicioE08.models;


import lombok.*;

import javax.persistence.*;
import javax.websocket.server.ServerEndpoint;
import java.util.ArrayList;

@Entity
@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
@Builder
public class Pedido {

    @Id
    @GeneratedValue
    private Long id;

    private String descripcionProducto;

    private int numeroPedido;

    private boolean estadoDeEnvio;


    @ManyToOne
    @JoinColumn(name = "cliente")
    private Cliente cliente;

    //helper

    public void addCliente(Cliente cl) {
        cliente = cl;
        if(cl.getPedidos()==null){
           cl.setPedidos((new ArrayList<>()));
            cl.getPedidos().add(this);
        }
    }

    public void removeCliente(Cliente cl) {
        cl.getPedidos().remove(this);
        cliente = null;

    }
}

