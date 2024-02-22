package com.brisas.inventarios.services;

import com.brisas.inventarios.models.Ipad;
import com.brisas.inventarios.models.Pantalla;
import com.brisas.inventarios.repository.IpadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class IpadServices extends DispositivoService {

    @Autowired
    IpadRepository ipadRepository;

    /**
     * public Optional<Ipad> getById(Long id) {
     * return ipadRepository.findById(id);
     * }
     * <p>
     * public void deleteById(Long id) {
     * ipadRepository.deleteById(id);
     * }
     * <p>
     * <p>
     * public Ipad saveIpad(Ipad dispositivo) {
     * return ipadRepository.save(dispositivo);
     * }
     */


    public List<Ipad> getIpads() {
        return ipadRepository.findAll();
    }


}
