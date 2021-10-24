package com.salesianos.triana.Ejercicio6E2.repos;

import com.salesianos.triana.Ejercicio6E2.model.CursoOnline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CursoOnlineRepository extends JpaRepository<CursoOnline,Long> {

}
