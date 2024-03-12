package com.brisas.inventarios.services;

import com.brisas.inventarios.models.Documento;
import com.brisas.inventarios.repository.DocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoService {

    @Autowired
    DocumentoRepository documentoRepository;

    public Documento saveDocumento(Documento documento) {
        return documentoRepository.save(documento);
    }

    public void deleteDocumento(Long id) {
        documentoRepository.deleteById(id);
    }

    public Documento getDocumentoByid(Long id) {
        return documentoRepository.findById(id).orElse(null);
    }

    public List<Documento> getDocumentos() {
        return documentoRepository.findAll();
    }
}
