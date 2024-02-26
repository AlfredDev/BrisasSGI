package com.brisas.inventarios.repository;


import com.brisas.inventarios.models.Llave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LlaveRepository extends JpaRepository<Llave,Long> {
}
