package com.salesianos.triana.ejercicioE07.Repository;

import com.salesianos.triana.ejercicioE07.Model.AddedTo;
import com.salesianos.triana.ejercicioE07.Model.AddedToPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddedToRepository extends JpaRepository<AddedTo, AddedToPK> {
}