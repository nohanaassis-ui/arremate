package com.senai.arremate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ObraArte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String categoria;
    private Double lanceMinimo;
    private Double lanceAtual;


    public ObraArte(){}

    public ObraArte(Long id, String titulo, String categoria, Double lanceMinimo, Double lanceAtual) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.lanceMinimo = lanceMinimo;
        this.lanceAtual = lanceAtual;
    }

    public ObraArte(String titulo, String categoria, Double lanceMinimo, Double lanceAtual) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.lanceMinimo = lanceMinimo;
        this.lanceAtual = lanceAtual;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getLanceMinimo() {
        return lanceMinimo;
    }

    public void setLanceMinimo(Double lanceMinimo) {
        this.lanceMinimo = lanceMinimo;
    }

    public Double getLanceAtual() {
        return lanceAtual;
    }

    public void setLanceAtual(Double lanceAtual) {
        this.lanceAtual = lanceAtual;
    }
}

