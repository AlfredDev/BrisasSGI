package com.brisas.inventarios.models;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Llave {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String tipoLlave;
    private String nivelPersonal;

    private String nuevaTarjeta;

    private LocalDate cracion;
    private LocalDate expiracion;

    private String fdu;
    private String edificio;
    private String Habitaciones;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "empleado_id")
    Empleado empleado;

    @OneToOne
    private BajaLlave bajaLlave;
    public Llave(){}

    public Llave(Long id, String tipoLlave, String nivelPersonal, String nuevaTarjeta, LocalDate cracion, LocalDate expiracion, String fdu, String edificio, String habitaciones, String estado, Empleado empleado) {
        this.id = id;
        this.tipoLlave = tipoLlave;
        this.nivelPersonal = nivelPersonal;
        this.nuevaTarjeta = nuevaTarjeta;
        this.cracion = cracion;
        this.expiracion = expiracion;
        this.fdu = fdu;
        this.edificio = edificio;
        this.Habitaciones = habitaciones;
        this.estado = estado;
        this.empleado = empleado;
    }

    public Llave(Long id, String tipoLlave, String nivelPersonal, String nuevaTarjeta, LocalDate cracion, LocalDate expiracion, String fdu, String edificio, String habitaciones, String estado) {
        this.id = id;
        this.tipoLlave = tipoLlave;
        this.nivelPersonal = nivelPersonal;
        this.nuevaTarjeta = nuevaTarjeta;
        this.cracion = cracion;
        this.expiracion = expiracion;
        this.fdu = fdu;
        this.edificio = edificio;
        Habitaciones = habitaciones;
        this.estado = estado;
    }


}
