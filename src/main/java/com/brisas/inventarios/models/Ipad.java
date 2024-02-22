package com.brisas.inventarios.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Ipad extends Dispositivo {

    private int capacidad;
    private int ram;

    public Ipad() {
    }

    public Ipad(Long id, String folio, String marca, String modelo, String serie, String estado, String descripcion, int capacidad, int ram) {
        super(id, folio, marca, modelo, serie, estado, descripcion);
        this.capacidad = capacidad;
        this.ram = ram;
    }
}
