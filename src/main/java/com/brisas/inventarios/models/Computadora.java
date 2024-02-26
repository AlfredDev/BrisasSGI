package com.brisas.inventarios.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Computadora extends Dispositivo {
    private String capacidadDisco;
    private String nombre;
    private String cpuSerie;
    private String tipo;
    private String procesador;
    private String cpuModelo;
    private String ram;

    @ManyToOne
    private Oficce oficce;
    @ManyToOne
    private Os os;

    @ManyToOne
    private Antivirus antivirus;

    public Computadora() {
    }

    public Computadora(Long id, String folio, String marca, String modelo, String serie, String estado, String descripcion, String capacidadDisco, String nombre, String cpuSerie, String tipo, String procesador, String cpuModelo, String ram, Oficce oficce, Os os, Antivirus antivirus) {
        super(id, folio, marca, modelo, serie, estado, descripcion);
        this.capacidadDisco = capacidadDisco;
        this.nombre = nombre;
        this.cpuSerie = cpuSerie;
        this.tipo = tipo;
        this.procesador = procesador;
        this.cpuModelo = cpuModelo;
        this.ram = ram;
        this.oficce = oficce;
        this.os = os;
        this.antivirus = antivirus;
    }

    public Computadora(Long id, String folio, String marca, String modelo, String serie, String estado, String descripcion, Set<Mantenimiento> mantenimientos, String capacidadDisco, String nombre, String cpuSerie, String tipo, String procesador, String cpuModelo, String ram, Oficce oficce, Os os, Antivirus antivirus) {
        super(id, folio, marca, modelo, serie, estado, descripcion, mantenimientos);
        this.capacidadDisco = capacidadDisco;
        this.nombre = nombre;
        this.cpuSerie = cpuSerie;
        this.tipo = tipo;
        this.procesador = procesador;
        this.cpuModelo = cpuModelo;
        this.ram = ram;
        this.oficce = oficce;
        this.os = os;
        this.antivirus = antivirus;
    }
}
