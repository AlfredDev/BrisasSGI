package com.brisas.inventarios.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idEmpleado", nullable = false)
    private Long id;
    private String nombre;
    private String apellidoMaterno;
    private String apellidoPaterno;

    @ManyToOne
    @JoinColumn(name = "idDepartamento")
    private Departamento departure;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String apellidoMaterno, String apellidoPaterno, Departamento departure) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.departure = departure;
    }
}
