package com.brisas.inventarios.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class BajaLlave {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDate fecha;

    @OneToOne
    private Llave llave;

    public BajaLlave() {
    }

    public BajaLlave(Long id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public BajaLlave(Long id, LocalDate fecha, Llave llave) {
        this.id = id;
        this.fecha = fecha;
        this.llave = llave;
    }
}
