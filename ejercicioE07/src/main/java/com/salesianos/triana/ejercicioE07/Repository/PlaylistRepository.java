package com.salesianos.triana.ejercicioE07.Repository;

import com.salesianos.triana.ejercicioE07.Model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist,Long> {

}
