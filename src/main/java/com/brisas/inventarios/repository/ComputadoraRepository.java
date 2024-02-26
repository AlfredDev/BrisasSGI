package com.brisas.inventarios.repository;

import com.brisas.inventarios.models.Computadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputadoraRepository extends JpaRepository<Computadora, Long> {
}
