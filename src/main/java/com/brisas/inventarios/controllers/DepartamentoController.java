package com.brisas.inventarios.controllers;


import com.brisas.inventarios.models.Departamento;
import com.brisas.inventarios.models.Empleado;
import com.brisas.inventarios.services.DepartamentoService;
import com.brisas.inventarios.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departamento")
public class DepartamentoController {
    @Autowired
    DepartamentoService departamentoService;

    @PostMapping("/save")
    public ResponseEntity<Departamento> saveDepartamento(@RequestBody Departamento departamento) {
        Departamento dep = departamentoService.saveDepartamento(departamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(dep);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteDepartamento(@PathVariable Long id) {
        Departamento depa = departamentoService.findById(id);
        if (depa == null) {
            System.out.println("Departamento not found");
        }
        departamentoService.remove(id);
    }

    @GetMapping("/departamentos")
    public List<Departamento> getDepartamentos() {
        return departamentoService.getDepartamentos();
    }


    /**
     * Obtiene un departamento por su ID.
     *
     * @param id ID del departamento a buscar.
     * @return Respuesta HTTP con el departamento encontrado o un mensaje de error si no se encuentra.
     */
    @GetMapping("/departamento/{id}")
    public ResponseEntity<Departamento> departamenoById(@PathVariable Long id) {
        Departamento departamento = departamentoService.findById(id);
        if (departamento == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(departamento);
    }


    @PostMapping("/actualiza/{id}")
    public ResponseEntity<Departamento> actualizarDepartamento(@PathVariable Long id, @RequestBody Departamento depart) {
        Departamento depaExistente = departamentoService.findById(id);
        if (depaExistente == null) {
            return ResponseEntity.notFound().build();
        }

        depart.setId(id);
        Departamento depaBD = departamentoService.saveDepartamento(depart);

        return ResponseEntity.ok().body(depaBD);
    }


    @Autowired
    EmpleadoService empleadoService;


}
