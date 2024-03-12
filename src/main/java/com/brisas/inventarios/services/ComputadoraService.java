package com.brisas.inventarios.services;

import com.brisas.inventarios.models.Computadora;
import com.brisas.inventarios.repository.ComputadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputadoraService extends DispositivoService {
    @Autowired
    ComputadoraRepository computadoraRepository;

    public List<Computadora> getComputadoras() {
        return computadoraRepository.findAll();
    }

    public Computadora getComputadoraById(Long id) {
        return computadoraRepository.findById(id).orElse(null);
    }
}
