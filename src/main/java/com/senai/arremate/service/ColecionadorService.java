package com.senai.arremate.service;

import com.senai.arremate.entity.Colecionador;
import com.senai.arremate.repository.ColecionadorRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColecionadorService {
    private final ColecionadorRepository colecionadorRepository;

    public ColecionadorService(ColecionadorRepository colecionadorRepository) {
        this.colecionadorRepository = colecionadorRepository;
    }

    public Colecionador salvar(Colecionador colecionador) {
        return colecionadorRepository.save(colecionador);
    }

    public List<Colecionador> listar() {
        return colecionadorRepository.findAll();
    }

    public void deletar(Long id) {
        colecionadorRepository.deleteById(id);
    }

    @Transactional
    public void alterar(Long id, Colecionador c) {
        Colecionador colecionador = colecionadorRepository.getReferenceById(id);
        colecionador.setNome(c.getNome());
        colecionador.setEmail(c.getEmail());
        colecionador.setCpf(c.getCpf());
        colecionador.setSaldoCarteira(c.getSaldoCarteira());
    }

}
