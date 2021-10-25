package com.salesianos.triana.ejercicioE07.Repository;

import com.salesianos.triana.ejercicioE07.Model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository< Song , Long> {
}
