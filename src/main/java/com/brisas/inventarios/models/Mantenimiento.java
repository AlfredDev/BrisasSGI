package com.brisas.inventarios.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Mantenimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDate fechaProgramada;
    private String estado;
    private LocalDate fechaRealizada;
    private String solucion;

    @ManyToMany
    @JoinTable(
            name = "mantenimiento_dispositivo",
            joinColumns = @JoinColumn(name = "mantenimiento_id"),
            inverseJoinColumns = @JoinColumn(name = "dispositivo_id")
    )
    private Set<Dispositivo> dispositivos  = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Mantenimiento() {
    }


    public Mantenimiento(Long id, LocalDate fechaProgramada, String estado, LocalDate fechaRealizada, String solucion, Set<Dispositivo> dispositivos, Usuario usuario) {
        this.id = id;
        this.fechaProgramada = fechaProgramada;
        this.estado = estado;
        this.fechaRealizada = fechaRealizada;
        this.solucion = solucion;
        this.dispositivos = dispositivos;
        this.usuario = usuario;
    }
}

