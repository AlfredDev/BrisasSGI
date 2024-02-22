package com.brisas.inventarios.repository;

import com.brisas.inventarios.models.Ipad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpadRepository extends JpaRepository<Ipad,Long> {
}
