package com.brisas.inventarios.repository;

import com.brisas.inventarios.models.BajaLlave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BajaLlaveRepository extends JpaRepository<BajaLlave, Long> {
}
