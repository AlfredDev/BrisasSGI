package com.brisas.inventarios.controllers;

import com.brisas.inventarios.models.Dispositivo;
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

}
