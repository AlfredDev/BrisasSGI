package com.brisas.inventarios.controllers;

import com.brisas.inventarios.models.Empleado;
import com.brisas.inventarios.models.Llave;
import com.brisas.inventarios.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/empleado")
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;

    @PostMapping("saveEmpleado")
    public ResponseEntity<Empleado> saveEmpleado(@RequestBody Empleado empleado) {
        Empleado nEmpleado = empleadoService.saveEmpleado(empleado);
        return ResponseEntity.status(HttpStatus.CREATED).body(nEmpleado);
    }

    @PostMapping("actualizarEmpleado/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado empleado) {
        Empleado emple = empleadoService.getEmpleadoById(id);

        if (empleado == null) {
            return ResponseEntity.notFound().build();
        }

        Empleado empleadoActualizado = empleadoService.saveEmpleado(empleado);

        return ResponseEntity.ok().body(empleadoActualizado);
    }

    @DeleteMapping("eliminaEmpleado/{id}")
    public ResponseEntity<Void> eliminaEmpleadoDelete(@PathVariable Long id) {
        Empleado empleado = empleadoService.getEmpleadoById(id);

        if (empleado == null) {
            return ResponseEntity.notFound().build();

        }

        empleadoService.eliminarEmpleado(id);
        return ResponseEntity.noContent().build();
    }


    @GetMapping("empleado/{id}")
    public Empleado findLlaveById(@PathVariable Long id) {
        return empleadoService.getEmpleadoById(id);
    }

    @GetMapping("empleados")
    public List<Empleado> getEmpleados() {
        return empleadoService.getEmpleados();
    }
}
