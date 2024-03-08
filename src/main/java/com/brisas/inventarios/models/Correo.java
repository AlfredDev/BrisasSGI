package com.brisas.inventarios.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Correo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCorreo", nullable = false)
    private Long id;

    private String categoriaPuesto;
    private String puesto;
    private String correo;
    private String contrasenia;
    private String estado;

    @OneToOne(cascade = CascadeType.ALL)
    private Empleado empleado;

    public Correo(Long id, String categoriaPuesto, String puesto, String correo, String contrasenia, String estado) {
        this.id = id;
        this.categoriaPuesto = categoriaPuesto;
        this.puesto = puesto;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.estado = estado;
    }

    public Correo() {

    }

    public Correo(Long id, String categoriaPuesto, String puesto, String correo, String contrasenia, String estado, Empleado empleado) {
        this.id = id;
        this.categoriaPuesto = categoriaPuesto;
        this.puesto = puesto;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.estado = estado;
        this.empleado = empleado;
    }
}
