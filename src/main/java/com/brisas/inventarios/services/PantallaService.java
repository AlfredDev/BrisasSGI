package com.brisas.inventarios.services;

import com.brisas.inventarios.models.Dispositivo;
import com.brisas.inventarios.models.Pantalla;
import com.brisas.inventarios.repository.PantallaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PantallaService  extends  DispositivoService{
    @Autowired
    PantallaRepository pantallaRepository;

    /**
     * public Optional<Pantalla> getById(Long id) {
     * return pantallaRepository.findById(id);
     * }
     * <p>
     * public void deleteById(Long id) {
     * pantallaRepository.deleteById(id);
     * }
     * public Pantalla savePantalla(Pantalla dispositivo) {
     * return pantallaRepository.save(dispositivo);
     * }
     */
    public List<Pantalla> getPantallaList() {
        return pantallaRepository.findAll();
    }


}
