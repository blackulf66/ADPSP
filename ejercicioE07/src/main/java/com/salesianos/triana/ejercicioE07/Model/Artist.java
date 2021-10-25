package com.salesianos.triana.ejercicioE07.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Artist {

    @GeneratedValue
    @Id
    private Long id;

    private String name;


   @OneToMany(mappedBy = "Song")
    private List<Song> songs = new ArrayList<>();

}
