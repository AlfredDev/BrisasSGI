package com.brisas.inventarios.repository;

import com.brisas.inventarios.models.Pantalla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PantallaRepository extends JpaRepository<Pantalla,Long> {

}
