package com.brisas.inventarios.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Celular extends Dispositivo {
    @ManyToOne
    @JoinColumn(name = "id_os")
    private Os os;

    public Celular() {
    }

    public Celular(Long id, String folio, String marca, String modelo, String serie, String estado, String descripcion, Os os) {
        super(id, folio, marca, modelo, serie, estado, descripcion);
        this.os = os;
    }

    public Celular(Long id, String folio, String marca, String modelo, String serie, String estado, String descripcion, Set<Mantenimiento> mantenimientos, Os os) {
        super(id, folio, marca, modelo, serie, estado, descripcion, mantenimientos);
        this.os = os;
    }
}
