package com.brisas.inventarios.repository;

import com.brisas.inventarios.models.TvBox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TvBoxRepository extends JpaRepository<TvBox, Long> {
}
