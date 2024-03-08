package com.brisas.inventarios.services;


import com.brisas.inventarios.models.BajaLlave;
import com.brisas.inventarios.repository.BajaLlaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BajaLlaveService {
    @Autowired
    BajaLlaveRepository bajaLlaveRepository;

    public BajaLlave saveBajaLlave(BajaLlave bajaLlave) {
        return bajaLlaveRepository.save(bajaLlave);
    }


    public BajaLlave bajaLlaveById(Long id) {
        return bajaLlaveRepository.findById(id).orElse(null);
    }


    public List<BajaLlave> getBajaLlaves() {
        return bajaLlaveRepository.findAll();
    }


    public void deleteBajaLlave(Long id) {
        bajaLlaveRepository.deleteById(id);
    }


}
