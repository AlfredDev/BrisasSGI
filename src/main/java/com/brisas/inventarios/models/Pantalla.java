package com.brisas.inventarios.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Pantalla extends Dispositivo {
    private String tamanio;

    public Pantalla() {

    }
    public Pantalla(Long id, String folio, String marca, String modelo, String serie, String estado, String descripcion, String tamanio) {
        super(id, folio, marca, modelo, serie, estado, descripcion);
        this.tamanio = tamanio;
    }


}
