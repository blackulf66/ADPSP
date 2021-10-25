package com.salesianos.triana.ejercicioE07;


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

@Component
@RequiredArgsConstructor
public class FakeMain {

    private final ArtistService artistService;
    private final SongService songService;
    private final PlaylistService playlistService;
    private final AddedToService addedToService;

    @PostConstruct
    public void init(){
        Artist artist = Artist.builder().name("Jorge tenorio").build();
        artistService.save(artist);

        Playlist playlist = Playlist.builder().title("el titulo").Album("el album").year("2000");
        playlist.save(playlist);

        Song song=Song.builder().name("la cancion del herrete").description("si").build();
        SongService.save(song);





    }

}
