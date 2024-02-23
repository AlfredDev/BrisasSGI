package com.brisas.inventarios.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idDepartamento", nullable = false)
    private Long id;
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Empleado> empleados = new ArrayList<>();;
    public  Departamento(){}

    public Departamento(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }


}
