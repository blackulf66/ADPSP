package com.salesianos.triana.ejercicioE07.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Playlist {

    @GeneratedValue
    @Id
    private Long id;

    private String name;
    @Lob
    private String description;


}
