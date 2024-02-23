package com.brisas.inventarios.services;

import com.brisas.inventarios.models.Dispositivo;
import com.brisas.inventarios.repository.DispositivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DispositivoService {


    @Autowired
    private DispositivoRepository dispositivoRepository;

    public Dispositivo saveDispositivo(Dispositivo dispositivo) {
        return dispositivoRepository.save(dispositivo);
    }

    public void deleteById(Long id) {
        dispositivoRepository.deleteById(id);
    }
}