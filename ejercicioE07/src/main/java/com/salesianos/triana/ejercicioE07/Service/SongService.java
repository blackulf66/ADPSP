package com.salesianos.triana.ejercicioE07.Service;

import com.salesianos.triana.ejercicioE07.Model.Song;
import com.salesianos.triana.ejercicioE07.Repository.SongRepository;
import org.springframework.stereotype.Service;

@Service
public class SongService extends BaseService<Song,Long, SongRepository> {
}
