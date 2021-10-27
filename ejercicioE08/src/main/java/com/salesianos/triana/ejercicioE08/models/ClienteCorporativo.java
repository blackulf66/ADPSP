package com.salesianos.triana.ejercicioE08.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.ArrayList;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ClienteCorporativo extends Cliente {

    private String nombreEmpresa;

    private double beneficios;

    @ManyToOne
    @JoinColumn(name = "empleado")
    private Empleado empleado;

    //helper

    public void addEmpleado(Empleado e) {
        empleado = e;
        if(e.getClientesCorporativos()==null){
            e.setClientesCorporativos((new ArrayList<>()));
            e.getClientesCorporativos().add(this);
        }
    }

    public void removeEmpleado(Empleado e) {
        empleado = null;
        e.getClientesCorporativos().remove(this);
    }
}
