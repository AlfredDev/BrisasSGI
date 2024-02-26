package com.brisas.inventarios.models;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Radio extends Dispositivo {
    private String antena;
    private String pila;
    private String carcasa;

    public Radio() {}

    public Radio(Long id, String folio, String marca, String modelo, String serie, String estado, String descripcion, String antena, String pila, String carcasa) {
        super(id, folio, marca, modelo, serie, estado, descripcion);
        this.antena = antena;
        this.pila = pila;
        this.carcasa = carcasa;
    }

    public Radio(Long id, String folio, String marca, String modelo, String serie, String estado, String descripcion, Set<Mantenimiento> mantenimientos, String antena, String pila, String carcasa) {
        super(id, folio, marca, modelo, serie, estado, descripcion, mantenimientos);
        this.antena = antena;
        this.pila = pila;
        this.carcasa = carcasa;
    }
}
