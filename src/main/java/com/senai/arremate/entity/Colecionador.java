package com.senai.arremate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

@Entity
public class Colecionador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nome;
    @Email
    private String email;
    @CPF
    private String cpf;
    private Double saldoCarteira;


    public Colecionador(){
    }

    public Colecionador(Long id, String nome, String email, String cpf, Double saldoCarteira) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.saldoCarteira = saldoCarteira;
    }

    public Colecionador(String nome, String email, String cpf, Double saldoCarteira) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.saldoCarteira = saldoCarteira;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSaldoCarteira() {
        return saldoCarteira;
    }

    public void setSaldoCarteira(Double saldoCarteira) {
        this.saldoCarteira = saldoCarteira;
    }
}
