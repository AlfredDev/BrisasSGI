package com.brisas.inventarios.controllers;

import com.brisas.inventarios.models.Computadora;
import com.brisas.inventarios.services.ComputadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/computadora")
public class ComputadoraController {

    @Autowired
    ComputadoraService computadoraService;

    @GetMapping("/computadoras")
    public ResponseEntity<List<Computadora>> getComputadoras() {
        return ResponseEntity.ok().body(computadoraService.getComputadoras());
    }

    @GetMapping("/computadora/{id}")
    public ResponseEntity<Computadora> getComputadoraById(@PathVariable Long id) {
        Computadora copmputadora = computadoraService.getComputadoraById(id);
        if (copmputadora == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(copmputadora);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        Computadora computadora = computadoraService.getComputadoraById(id);
        if (computadora == null) {
            return ResponseEntity.notFound().build();
        }
        computadoraService.deleteById(id);
        return ResponseEntity.ok().body("Computadora borrada");
    }

    @PostMapping("/save")
    public ResponseEntity<Computadora> saveComputadora(@RequestBody Computadora computadora) {
        Computadora computadoraNueva = (Computadora) computadoraService.saveDispositivo(computadora);
        return ResponseEntity.status(HttpStatus.CREATED).body(computadoraNueva);
    }

    @PostMapping("/actualiza/{id}")
    public ResponseEntity<Computadora> actualizaComputadora(@PathVariable Long id, @RequestBody Computadora computadora) {
        Computadora computadora1 = computadoraService.getComputadoraById(id);
        if (computadora1 == null) {
            return ResponseEntity.notFound().build();
        }
        computadora.setId(id);
        Computadora computadoraBd = (Computadora) computadoraService.saveDispositivo(computadora);
        return ResponseEntity.ok().body(computadoraBd);
    }
}
