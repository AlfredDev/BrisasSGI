package com.brisas.inventarios.controllers;

import com.brisas.inventarios.models.Pantalla;
import com.brisas.inventarios.services.PantallaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pantalla")
public class PantallaController {

    @Autowired
    PantallaService pantallaService;

    @GetMapping("getPantallas")
    public List<Pantalla> getPantallas() {
        return pantallaService.getPantallaList();
    }


    @PostMapping("savePantalla")
    public Pantalla savePantalla(@RequestBody Pantalla pantalla) {
        return (Pantalla) pantallaService.saveDispositivo(pantalla);
    }

    @DeleteMapping("/{id}")
    public void deletePantalla(@PathVariable Long id) {
        pantallaService.deleteById(id);
    }


    @PostMapping("/actualiza/{id}")
    public ResponseEntity<Pantalla> actualiza(@PathVariable Long id, @RequestBody Pantalla pantalla) {
        Pantalla pantalla1 = pantallaService.getPantallaById(id);
        if (pantalla1 == null) {
            return ResponseEntity.notFound().build();
        }
        pantalla.setId(id);
        Pantalla pantallaBD = (Pantalla) pantallaService.saveDispositivo(pantalla);
        return ResponseEntity.ok().body(pantallaBD);
    }

}
