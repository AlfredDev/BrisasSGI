package com.brisas.inventarios.models;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Telefono extends Dispositivo{
    private String tipo;

    public Telefono() {}

    public Telefono(Long id, String folio, String marca, String modelo, String serie, String estado, String descripcion, String tipo) {
        super(id, folio, marca, modelo, serie, estado, descripcion);
        this.tipo = tipo;
    }

    public Telefono(Long id, String folio, String marca, String modelo, String serie, String estado, String descripcion, Set<Mantenimiento> mantenimientos, String tipo) {
        super(id, folio, marca, modelo, serie, estado, descripcion, mantenimientos);
        this.tipo = tipo;
    }
}
