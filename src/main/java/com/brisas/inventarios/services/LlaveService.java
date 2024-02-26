package com.brisas.inventarios.services;

import com.brisas.inventarios.models.Llave;
import com.brisas.inventarios.repository.LlaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class LlaveService {
    @Autowired
    private LlaveRepository llaveRepository;


    public Llave findLlaveById(Long id) {
        return llaveRepository.findById(id).orElse(null);
    }

    public List<Llave> findAllLLaves() {
        return llaveRepository.findAll();
    }

    public Llave saveLlave(Llave l) {
        return llaveRepository.save(l);
    }

    public List<Llave> expiredLlaves(LocalDate date) {
        return llaveRepository.findByExpiracionBefore(date);
    }

    public void eliminarLlave(Long id) {
        llaveRepository.deleteById(id);
    }

    public List<Llave> obtenerLlavesProximasExpirar(int diasAntesDeExpirar) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaLimite = fechaActual.plusDays(diasAntesDeExpirar);
        return llaveRepository.findByExpiracionBetween(fechaActual, fechaLimite);
    }
}
