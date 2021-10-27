package com.salesianos.triana.ejercicioE08.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empleado {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private String apellidos;

    private double sueldo;

    private String cargo;

    @OneToMany(mappedBy = "empleado")
    private List<ClienteCorporativo> clientesCorporativos = new ArrayList<>();




}
