package com.salesianos.triana.ejercicioE07.Model;

import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity @Builder
public class Artist {

    @GeneratedValue
    @Id
    private Long id;

    private String name;

   @OneToMany(mappedBy = "songs")
    private List<Playlist> playlists = new ArrayList<>();

}
