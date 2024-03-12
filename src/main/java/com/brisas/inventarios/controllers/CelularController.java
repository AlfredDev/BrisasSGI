package com.brisas.inventarios.controllers;

import com.brisas.inventarios.models.Celular;
import com.brisas.inventarios.services.CelularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/celular")
public class CelularController {
    @Autowired
    CelularService celularService;

    @PostMapping("/save")
    public ResponseEntity<Celular> saveCelular(@RequestBody Celular celular) {
        Celular celularNuevo = (Celular) celularService.saveDispositivo(celular);
        return ResponseEntity.status(HttpStatus.CREATED).body(celularNuevo);
    }

    @PostMapping("/actualiza")
    public ResponseEntity<Celular> updateCelular(@PathVariable Long id, @RequestBody Celular celular) {
        Celular celular1 = celularService.getCelularById(id);
        if (celular1 == null) {
            return ResponseEntity.notFound().build();
        }
        celular.setId(id);
        Celular celularBd = (Celular) celularService.saveDispositivo(celular);
        return ResponseEntity.ok().body(celularBd);
    }

    @GetMapping("/celular/{id}")
    public ResponseEntity<Celular> getCelularById(@PathVariable Long id) {
        Celular celular = celularService.getCelularById(id);
        if (celular == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(celular);
    }

    @GetMapping("/celulares")
    public List<Celular> getCelulares() {
        return celularService.getCelular();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCelular(@PathVariable Long id) {
        celularService.deleteById(id);
    }
}
