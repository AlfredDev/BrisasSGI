package com.brisas.inventarios.controllers;


import com.brisas.inventarios.models.Dispositivo;
import com.brisas.inventarios.models.Ipad;
import com.brisas.inventarios.models.Pantalla;
import com.brisas.inventarios.services.IpadServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ipads")
public class IpadController {

    @Autowired
    IpadServices ipadServices;

    @GetMapping("getIpads")
    public List<Ipad> getPantallas() {
        return ipadServices.getIpads();
    }



    @PostMapping("saveIpad")
    public Ipad savePantalla(@RequestBody Ipad ipad) {
        return (Ipad) ipadServices.saveDispositivo(ipad);
    }

    @DeleteMapping("/{id}")
    public void deletePantalla(@PathVariable Long id) {
        ipadServices.deleteById(id);
    }
}
