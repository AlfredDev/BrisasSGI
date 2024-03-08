package com.brisas.inventarios.controllers;

import com.brisas.inventarios.models.BajaDispositivo;
import com.brisas.inventarios.services.BajaDispositivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bajadispositivo")
public class BajaDispositivoController {
    @Autowired
    BajaDispositivoService bajaDispositivoService;

    @PostMapping("/save")
    public ResponseEntity<BajaDispositivo> saveBajaDispositivo(@RequestBody BajaDispositivo baja) {
        BajaDispositivo bajaDispositivo = bajaDispositivoService.saveBajaDispositivo(baja);
        return ResponseEntity.status(HttpStatus.CREATED).body(bajaDispositivo);
    }

    @GetMapping("/bajadispositivos")
    public List<BajaDispositivo> getBajaDispositivos() {
        return bajaDispositivoService.getBajaDispositivos();
    }

    @GetMapping("bajadispositivo/{id}")
    public ResponseEntity<BajaDispositivo> bajadispositivoById(@PathVariable Long id) {
        BajaDispositivo baja = bajaDispositivoService.findBajaDispositivoById(id);
        if (baja == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(baja);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteBajaDispositivo(@PathVariable Long id) {
        BajaDispositivo bajaDispositivo = bajaDispositivoService.findBajaDispositivoById(id);
        if (bajaDispositivo == null) {
            System.out.println("No existe");
            return;
        }
        bajaDispositivoService.DeleteBajaDispositivo(id);
        System.out.println("Delete");
    }
}
