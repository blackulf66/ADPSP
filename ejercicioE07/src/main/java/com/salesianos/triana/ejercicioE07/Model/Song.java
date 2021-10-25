package com.salesianos.triana.ejercicioE07.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Song {

    @GeneratedValue
    @Id
    private Long id;

    private String title;

    private Artist artist;

    private String album;

    private String year;


    @ManyToOne
    private Song song;

    public void addArtist(Artist a) {
        this.artist = a;
        a.getSongs().add(this);
    }

    public void removeArtist(Artist a) {
        a.getSongs().remove(this);
        this.song = null;
    }


}
