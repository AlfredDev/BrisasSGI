package com.brisas.inventarios.repository;

import com.brisas.inventarios.models.MicroImpresora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MicroImpresoraRepository extends JpaRepository<MicroImpresora,Long> {
}
