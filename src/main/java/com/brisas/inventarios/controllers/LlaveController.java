package com.brisas.inventarios.controllers;

import com.brisas.inventarios.models.Llave;
import com.brisas.inventarios.services.LlaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/llaves")
public class LlaveController {
    @Autowired
    LlaveService llaveService;

    @PostMapping("saveLlave")
    public ResponseEntity<Llave> guardarLLave(@RequestBody Llave llave) {
        Llave newLlave = llaveService.saveLlave(llave);
        return ResponseEntity.status(HttpStatus.CREATED).body(newLlave);
    }

    @PostMapping("actualizaLLave/{id}")
    public ResponseEntity<Llave> actualizaLLave(@PathVariable Long id, @RequestBody Llave llaveActualizada) {
        Llave llaveExistente = llaveService.findLlaveById(id);

        if (llaveExistente == null) {
            return ResponseEntity.notFound().build();
        }

        llaveActualizada.setId(id);

        Llave llaveActualizadaEnBD = llaveService.saveLlave(llaveActualizada);

        return ResponseEntity.ok().body(llaveActualizadaEnBD);
    }

    @DeleteMapping("eliminaLLave/{id}")
    public ResponseEntity<Void> eliminarLlave(@PathVariable Long id) {
        Llave llaveExistente = llaveService.findLlaveById(id);

        if (llaveExistente == null) {
            return ResponseEntity.notFound().build();
        }

        llaveService.eliminarLlave(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping("llaves")
    public List<Llave> getAllLLaves() {
        return llaveService.findAllLLaves();
    }

    @GetMapping("llaveById/{id}")
    public ResponseEntity<Llave> obtenerLlavePorId(@PathVariable Long id) {
        Llave llave = llaveService.findLlaveById(id);

        if (llave == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(llave);
    }

    @GetMapping("llavesporexpirar/{dias}")
    public List<Llave> getLlavesPorexpirar(@PathVariable int dias) {
        return llaveService.obtenerLlavesProximasExpirar(dias);
    }
}