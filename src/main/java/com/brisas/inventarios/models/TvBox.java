package com.brisas.inventarios.models;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class TvBox extends Dispositivo
{
    public  TvBox(){}

    public TvBox(Long id, String folio, String marca, String modelo, String serie, String estado, String descripcion) {
        super(id, folio, marca, modelo, serie, estado, descripcion);
    }

    public TvBox(Long id, String folio, String marca, String modelo, String serie, String estado, String descripcion, Set<Mantenimiento> mantenimientos) {
        super(id, folio, marca, modelo, serie, estado, descripcion, mantenimientos);
    }
}
