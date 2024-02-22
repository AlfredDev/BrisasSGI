package com.brisas.inventarios.repository;

import com.brisas.inventarios.models.Dispositivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispositivoRepository extends JpaRepository<Dispositivo,Long> {

}
