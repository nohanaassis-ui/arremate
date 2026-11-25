package com.senai.arremate.service;

import com.senai.arremate.entity.ObraArte;
import com.senai.arremate.repository.ObraArteRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObraArteService {
    private final ObraArteRepository obraArteRepository;

    public ObraArteService(ObraArteRepository obraArteRepository) {
        this.obraArteRepository = obraArteRepository;
    }

    public ObraArte salvar(ObraArte obra) {
        if (obra.getLanceAtual() == null) {
            obra.setLanceAtual(obra.getLanceMinimo());
        }
        return obraArteRepository.save(obra);
    }

    public List<ObraArte> listar() {
        return obraArteRepository.findAll();
    }

    @Transactional
    public void alterar(Long id, ObraArte o) {
        ObraArte obra = obraArteRepository.getReferenceById(id);
        obra.setTitulo(o.getTitulo());
        obra.setCategoria(o.getCategoria());
        obra.setLanceMinimo(o.getLanceMinimo());
        obra.setLanceMinimo(o.getLanceAtual());
    }

    public void deletar(Long id) {
        obraArteRepository.deleteById(id);
    }
}


