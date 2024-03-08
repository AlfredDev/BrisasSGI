package com.brisas.inventarios.controllers;

import com.brisas.inventarios.models.BajaLlave;
import com.brisas.inventarios.services.BajaLlaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bajallave")
public class BajallaveController {
    @Autowired
    BajaLlaveService bajaLlaveService;


    @GetMapping("/bajallave/{id}")
    public ResponseEntity<BajaLlave> getBajaLlaveById(@PathVariable Long id) {
        BajaLlave bajaLlave = bajaLlaveService.bajaLlaveById(id);
        if (bajaLlave == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(bajaLlave);
    }

    @GetMapping("/bajallaves")
    public List<BajaLlave> getBajaLaves() {
        return bajaLlaveService.getBajaLlaves();
    }


    @PostMapping("/save")
    public ResponseEntity<BajaLlave> saveBajaLlave(@RequestBody BajaLlave bajaLlave) {
        BajaLlave bajaLlave1 = bajaLlaveService.saveBajaLlave(bajaLlave);
        return ResponseEntity.status(HttpStatus.CREATED).body(bajaLlave1);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBajaLlave(@PathVariable Long id) {
        BajaLlave bajaLlave = bajaLlaveService.bajaLlaveById(id);
        if (bajaLlave == null) {
            System.out.println("LLave no existe");
            return;
        }
        bajaLlaveService.deleteBajaLlave(id);
    }
}
