package com.senai.arremate.controller;

import com.senai.arremate.entity.ObraArte;
import com.senai.arremate.service.ObraArteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/obras")
public class ObraArteController {
    private  final ObraArteService obraArteService;

    public ObraArteController(ObraArteService obraArteService) {
        this.obraArteService = obraArteService;
    }

    @PostMapping
    public ObraArte cadastrar(@RequestBody ObraArte obra) {
        return obraArteService.salvar(obra);
    }

    @GetMapping
    public List<ObraArte> listar() {
        return obraArteService.listar();
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable Long id, @RequestBody ObraArte obra) {
        obraArteService.alterar(id, obra);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        obraArteService.deletar(id);
    }
}


