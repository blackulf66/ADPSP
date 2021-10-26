package com.salesianos.triana.ejercicioE07;


import com.salesianos.triana.ejercicioE07.Model.AddedTo;
import com.salesianos.triana.ejercicioE07.Model.Artist;
import com.salesianos.triana.ejercicioE07.Model.Playlist;
import com.salesianos.triana.ejercicioE07.Model.Song;
import com.salesianos.triana.ejercicioE07.Repository.AddedToRepository;
import com.salesianos.triana.ejercicioE07.Repository.ArtistRepository;
import com.salesianos.triana.ejercicioE07.Repository.PlaylistRepository;
import com.salesianos.triana.ejercicioE07.Repository.SongRepository;
import com.salesianos.triana.ejercicioE07.Service.AddedToService;
import com.salesianos.triana.ejercicioE07.Service.ArtistService;
import com.salesianos.triana.ejercicioE07.Service.PlaylistService;
import com.salesianos.triana.ejercicioE07.Service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class FakeMain {


    private final ArtistService artistService;
    private final SongService songService;
    private final PlaylistService playlistService;
    private final AddedToService addedToService;


    @PostConstruct
    public void init() {
        Artist artist1 = Artist.builder().name("nombre1").build();
        artistService.save(artist1);

        Artist artist2 = Artist.builder().name("nombre2").build();
        artistService.save(artist2);

        Song song1 = Song.builder().Album("song1").title("title1")
                                  .year("2000").build();
        song1.addArtist(artist1);
        songService.save(song1);

        Song song2 = Song.builder().Album("song2").title("title2")
                .year("2000").build();
        song1.addArtist(artist2);
        songService.save(song2);


        Playlist playlist = Playlist.builder().name("Playlist1")
                                    .description("si").build();
        playlistService.save(playlist);

        AddedTo addedTo = AddedTo.builder().dateTime(LocalDateTime.now())
                         .orden(1).build();
        addedTo.addSongPlaylist(song1,playlist);
        addedTo.addSongPlaylist(song2,playlist);
        addedToService.save(addedTo);



    }

}
