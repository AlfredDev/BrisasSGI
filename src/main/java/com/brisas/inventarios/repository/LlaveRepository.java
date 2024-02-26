package com.brisas.inventarios.repository;


import com.brisas.inventarios.models.Llave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface LlaveRepository extends JpaRepository<Llave,Long> {
    List<Llave> findByExpiracionBefore(LocalDate fecha);
    List<Llave> findByExpiracionBetween(LocalDate fechaInicio, LocalDate fechaFin);

}

