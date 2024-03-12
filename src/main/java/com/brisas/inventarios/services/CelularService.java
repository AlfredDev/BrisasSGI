package com.brisas.inventarios.services;

import com.brisas.inventarios.models.Celular;
import com.brisas.inventarios.repository.CelularRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class CelularService extends DispositivoService {
    @Autowired
    CelularRepository celularRepository;

    public List<Celular> getCelular() {
        return celularRepository.findAll();
    }

    public Celular getCelularById(Long id) {
        return celularRepository.findById(id).orElse(null);
    }


}
