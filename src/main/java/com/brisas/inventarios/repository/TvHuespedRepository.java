package com.brisas.inventarios.repository;

import com.brisas.inventarios.models.TvHuesped;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TvHuespedRepository extends JpaRepository<TvHuesped, Long> {
}
