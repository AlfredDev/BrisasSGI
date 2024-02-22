package com.brisas.inventarios.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String folio;
    private String marca;
    private String modelo;
    private String serie;
    private String estado;
    private String descripcion;

    public Dispositivo(Long id, String folio, String marca, String modelo, String serie, String estado, String descripcion) {
        this.id = id;
        this.folio = folio;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public Dispositivo() {

    }
}
