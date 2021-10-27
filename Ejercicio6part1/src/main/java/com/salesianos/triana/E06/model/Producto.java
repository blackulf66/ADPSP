package com.salesianos.triana.E06.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
public class Producto {

    @Id
    @GeneratedValue
    private Long Id;

    private String nombre;

    private double pvp;

    @ManyToOne
    @JoinColumn(name = "categoria", foreignKey = @ForeignKey(name = "FK_PRODUCTO_CATEGORIA"))
    private Categoria categoria;

    //Metodos Helpers de Categoria

    public void addCategoria(Categoria c){
        categoria = c;
            c.setProductos(new ArrayList<>());
            c.getProductos().add(this);
    }

    public void removeCategoria(Categoria c){
        c.getProductos().remove(this);
        categoria = null;
    }
}
