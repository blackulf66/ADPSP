package com.salesianos.triana.ejercicioE07.Model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
public class AddedTo {

    @Builder.Default
    @EmbeddedId
    private AddedToPK id = new AddedToPK();

    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name="song_id")
    private Song song;

    @ManyToOne
    @MapsId("playlist_id")
    @JoinColumn(name="playlist_id")
    private Playlist playlist;

    private LocalDateTime dateTime;

    private int orden;



    //Helpers

    public void addSong(Song s){
        song = s;
        s.getAddedTos().add(this);
    }
    public void removeSong(Song s){
        song = s;
        s.getAddedTos().remove(this);
    }
    public void addPlaylist(Playlist p){
        playlist = p;
        p.getAddedTos().add(this);
    }
    public void removePlaylist(Playlist p){
        playlist = p;
        p.getAddedTos().remove(this);
    }
    public void addSongPlaylist(Song s, Playlist p){
        addSong(s);
        addPlaylist(p);
    }
    public void removeSongPlaylist(Song s, Playlist p){
        removePlaylist(p);
        removeSong(s);
    }
}