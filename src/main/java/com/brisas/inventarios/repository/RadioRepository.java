package com.brisas.inventarios.repository;

import com.brisas.inventarios.models.Radio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RadioRepository extends JpaRepository<Radio, Long> {

}
