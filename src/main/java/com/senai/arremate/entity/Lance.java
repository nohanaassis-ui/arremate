package com.senai.arremate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Lance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private Double valor;
   private LocalDateTime dataHora;
   private Boolean vencedor;
   private String Colecionador;

   public Lance(){
   }

    public Lance(Long id, Double valor, LocalDateTime dataHora, Boolean vencedor, String colecionador) {
        this.id = id;
        this.valor = valor;
        this.dataHora = dataHora;
        this.vencedor = vencedor;
        Colecionador = colecionador;
    }

    public Lance(Double valor, LocalDateTime dataHora, Boolean vencedor, String colecionador) {
        this.valor = valor;
        this.dataHora = dataHora;
        this.vencedor = vencedor;
        Colecionador = colecionador;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Boolean getVencedor() {
        return vencedor;
    }

    public void setVencedor(Boolean vencedor) {
        this.vencedor = vencedor;
    }

    public String getColecionador() {
        return Colecionador;
    }

    public void setColecionador(String colecionador) {
        Colecionador = colecionador;
    }
}
