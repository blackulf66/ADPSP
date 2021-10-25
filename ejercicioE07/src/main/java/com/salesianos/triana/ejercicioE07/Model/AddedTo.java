package com.salesianos.triana.ejercicioE07.Model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity @Builder
public class AddedTo {

    @ManyToOne
    @JoinColumn(name = "playlist")
    private Playlist playlist;

    private DateTimeFormat datetime;

    private int order;

    @EmbeddedId
    private AddedToPK id = new AddedToPK();

    @ManyToOne
    @JoinColumn(name = "song")
    private Song song;


    public AddedTo(DateTimeFormat datetime, int order) {
        this.datetime = datetime;
        this.order = order;
    }

    public AddedTo(Song song, Playlist playlist, DateTimeFormat datetime, int order) {
        this.song = song;
        this.playlist = playlist;
        this.datetime = datetime;
        this.order = order;
    }

    public AddedTo(Song song, Playlist playlist) {
        this.song = song;
        this.playlist = playlist;
    }
}