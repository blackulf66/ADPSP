package com.salesianos.triana.ejercicioE07.Repository;

import com.salesianos.triana.ejercicioE07.Model.Artist;
import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {

}
