package com.brisas.inventarios.services;


import com.brisas.inventarios.models.Departamento;
import com.brisas.inventarios.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {
    @Autowired
    DepartamentoRepository departamentoRepository;

    public Departamento findById(Long id) {
        return departamentoRepository.findById(id).orElse(null);
    }


    public List<Departamento> getDepartamentos() {
        return departamentoRepository.findAll();
    }


    public void remove(Long id) {
        departamentoRepository.deleteById(id);
        System.out.println("remove");

    }

    public Departamento saveDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }
}
