package com.brisas.inventarios.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Oficce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombre;

    public Oficce() {}

    public Oficce(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
