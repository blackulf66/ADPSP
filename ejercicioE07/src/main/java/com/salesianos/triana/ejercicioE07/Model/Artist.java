package com.salesianos.triana.ejercicioE07.Model;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity @Builder
public class Artist implements Serializable {

    @GeneratedValue
    @Id
    private Long id;

    private String name;

   @OneToMany(mappedBy = "artist")
    private List<Song> songs = new ArrayList<>();

}
