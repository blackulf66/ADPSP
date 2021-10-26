package com.salesianos.triana.ejercicioE07.Service;

import com.salesianos.triana.ejercicioE07.Model.AddedTo;
import com.salesianos.triana.ejercicioE07.Model.AddedToPK;
import com.salesianos.triana.ejercicioE07.Model.Playlist;
import com.salesianos.triana.ejercicioE07.Model.Song;
import com.salesianos.triana.ejercicioE07.Repository.AddedToRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AddedToService extends BaseService<AddedTo, AddedToPK, AddedToRepository> {
        public void createAddedTo (Playlist p , Song s , SongService ss , PlaylistService ps){
            AddedTo addedTo = AddedTo.builder().orden(5).dateTime(LocalDateTime.now()).build();

            addedTo.addSongPlaylist(s,p);
        }
    }
