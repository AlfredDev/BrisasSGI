package com.brisas.inventarios.services;

import com.brisas.inventarios.models.Correo;
import com.brisas.inventarios.repository.CorreoRepository;
import org.apache.tomcat.util.http.parser.Cookie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CorreoService {
    @Autowired
    CorreoRepository correoRepository;


    public Correo saveCorreo(Correo correo) {
        return correoRepository.save(correo);
    }

    public List<Correo> getCorreos() {
        return correoRepository.findAll();
    }

    public Correo getCooreoById(Long id) {
        return correoRepository.findById(id).orElse(null);
    }

    public void removeCorreo(Long id) {
        correoRepository.deleteById(id);
        System.out.println("remove");
    }

}
