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
public class Song implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String Album;

    private String year;

    @ManyToOne
    @JoinColumn(name = "artist")
    private Artist artist;

    @Builder.Default
    @OneToMany(mappedBy = "song", fetch = FetchType.EAGER)
    private List<AddedTo> addedTos = new ArrayList<>();

    public void addArtist(Artist a) {
        artist = a;
            a.getSongs().add(this);
        }

    public void removeArtist(Artist a) {
        artist = null;
        a.getSongs().remove(this);
    }

}