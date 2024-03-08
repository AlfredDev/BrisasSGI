package com.brisas.inventarios.repository;

import com.brisas.inventarios.models.BajaDispositivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BajaDispositivoReposiory extends JpaRepository<BajaDispositivo, Long> {
}
