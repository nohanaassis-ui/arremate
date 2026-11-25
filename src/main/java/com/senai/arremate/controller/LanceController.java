package com.senai.arremate.controller;

import com.senai.arremate.entity.Lance;
import com.senai.arremate.service.LanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/lances")
public class LanceController {
    private final LanceService lanceService;

    public LanceController(LanceService lanceService) {
        this.lanceService = lanceService;
    }

    @PostMapping
    public Lance cadastrar(@RequestBody Lance lance) {
        return lanceService.salvar(lance);
    }

    @GetMapping
    public List<Lance> listar() {
        return lanceService.listar();
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable Long id, @RequestBody Lance lance) {
        lanceService.alterar(id, lance);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        lanceService.deletar(id);
    }
}
