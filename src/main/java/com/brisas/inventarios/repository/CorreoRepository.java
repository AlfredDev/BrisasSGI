package com.brisas.inventarios.repository;

import com.brisas.inventarios.models.Correo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorreoRepository extends JpaRepository<Correo, Long> {
}
