package com.brisas.inventarios.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Data
@Entity
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDate fecha;
    private String ruta;

    @ManyToOne
    @JoinColumn(name = "dispositivo_id")
    private Dispositivo dispositivo;

    public Documento() {
    }

    public Documento(Long id, LocalDate fecha, String ruta, Dispositivo dispositivo) {
        this.id = id;
        this.fecha = fecha;
        this.ruta = ruta;
        this.dispositivo = dispositivo;
    }
}
