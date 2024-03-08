package com.brisas.inventarios.services;

import com.brisas.inventarios.models.BajaDispositivo;
import com.brisas.inventarios.repository.BajaDispositivoReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BajaDispositivoService {
    @Autowired
    BajaDispositivoReposiory bajaDispositivoRepository;

    public BajaDispositivo saveBajaDispositivo(BajaDispositivo bajaDis) {
        return bajaDispositivoRepository.save(bajaDis);
    }


    public BajaDispositivo findBajaDispositivoById(Long id) {
        return bajaDispositivoRepository.findById(id).orElse(null);
    }

    public void DeleteBajaDispositivo(Long id) {
        bajaDispositivoRepository.deleteById(id);
    }


    public List<BajaDispositivo> getBajaDispositivos() {
        return bajaDispositivoRepository.findAll();
    }
}
