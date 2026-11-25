package com.senai.arremate.service;

import com.senai.arremate.entity.Lance;
import com.senai.arremate.repository.LanceRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LanceService {
    private final LanceRepository lanceRepository;

    public LanceService(LanceRepository lanceRepository) {
        this.lanceRepository = lanceRepository;
    }

    public Lance salvar(Lance lance) {
        if (lance.getDataHora() == null) {
            lance.setDataHora(LocalDateTime.now());
        }
        return lanceRepository.save(lance);
    }

    public List<Lance> listar() {
        return lanceRepository.findAll();
    }

    @Transactional
    public void alterar(Long id, Lance l) {
        Lance lance = lanceRepository.getReferenceById(id);
        lance.setValor(l.getValor());
        lance.setDataHora(l.getDataHora());
        lance.setVencedor(l.getVencedor());
        lance.setColecionador(l.getColecionador());
    }

    public void deletar(Long id) {
        lanceRepository.deleteById(id);
    }
}

