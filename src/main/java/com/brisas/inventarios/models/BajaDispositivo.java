package com.brisas.inventarios.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class BajaDispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String motivo;
    private LocalDate fecha;

    @OneToOne
    @JoinColumn(name = "dispotivo_id", unique = true)
    private Dispositivo dispositivo;

    public BajaDispositivo() {
    }

    public BajaDispositivo(Long id, String motivo, LocalDate fecha, Dispositivo dispositivo) {
        this.id = id;
        this.motivo = motivo;
        this.fecha = fecha;
        this.dispositivo = dispositivo;
    }
}
