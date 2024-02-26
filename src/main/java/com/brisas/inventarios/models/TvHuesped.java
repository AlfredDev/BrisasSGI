package com.brisas.inventarios.models;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class TvHuesped extends Dispositivo {
    private String tamanio;

    public TvHuesped() {
    }

    public TvHuesped(Long id, String folio, String marca, String modelo, String serie, String estado, String descripcion, String tamanio) {
        super(id, folio, marca, modelo, serie, estado, descripcion);
        this.tamanio = tamanio;
    }

    public TvHuesped(Long id, String folio, String marca, String modelo, String serie, String estado, String descripcion, Set<Mantenimiento> mantenimientos, String tamanio) {
        super(id, folio, marca, modelo, serie, estado, descripcion, mantenimientos);
        this.tamanio = tamanio;
    }
}
