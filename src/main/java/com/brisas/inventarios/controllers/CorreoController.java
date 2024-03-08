package com.brisas.inventarios.controllers;

import com.brisas.inventarios.models.Correo;
import com.brisas.inventarios.models.Llave;
import com.brisas.inventarios.repository.CorreoRepository;
import com.brisas.inventarios.services.CorreoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/correo")
public class CorreoController {
    @Autowired
    CorreoService correoService;

    @PostMapping("saveCorreo")
    public ResponseEntity<Correo> saveCorreo(@RequestBody Correo correo) {
        Correo newCorreo = correoService.saveCorreo(correo);
        return ResponseEntity.status(HttpStatus.CREATED).body(newCorreo);
    }

    @PostMapping("correo/{id}")
    public Correo acualizacorreo(@PathVariable Long id, @RequestBody Correo correoActualizado) {
        Correo correoExistenete = correoService.getCooreoById(id);
        if (correoExistenete == null) {
            System.err.println("Correo not found");
            return null;
        }
        correoActualizado.setId(id);
        return correoService.saveCorreo(correoActualizado);
    }

    @DeleteMapping("elimina/{id}")
    public void eliminaCorreo(@PathVariable Long id) {
        correoService.removeCorreo(id);
    }

    @GetMapping("correos")
    public List<Correo> getCorreos() {
        return correoService.getCorreos();
    }

    @GetMapping("correobyid/{id}")
    public ResponseEntity<Correo> getCorreoById(@PathVariable Long id) {
        Correo correo = correoService.getCooreoById(id);
        if (correo == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(correo);
    }
}
