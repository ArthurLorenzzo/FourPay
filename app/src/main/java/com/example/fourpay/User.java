package com.example.fourpay;

public class User {

    String nome;
    String cpf;
    String rg;
    String email;
    String celular;
    double renda;

    public User(String nome, String cpf, String rg, String email, String celular, double renda){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.celular = celular;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }


}
