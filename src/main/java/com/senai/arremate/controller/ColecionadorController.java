package com.senai.arremate.controller;

import com.senai.arremate.entity.Colecionador;
import com.senai.arremate.service.ColecionadorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/colecionador")
public class ColecionadorController {

    private final ColecionadorService colecionadorService;

    public ColecionadorController(ColecionadorService colecionadorService) {
        this.colecionadorService = colecionadorService;
    }

    @PostMapping
    public Colecionador cadastrar(@RequestBody Colecionador colecionador) {
        return colecionadorService.salvar(colecionador);
    }

    @GetMapping
    public List<Colecionador> listar() {
        return colecionadorService.listar();
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable Long id, @RequestBody Colecionador colecionador) {
        colecionadorService.alterar(id, colecionador);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        colecionadorService.deletar(id);
    }
}
