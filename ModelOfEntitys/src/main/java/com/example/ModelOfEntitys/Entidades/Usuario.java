package com.example.ModelOfEntitys.Entidades;

public class Usuario {
    private String email;
    private String senha;
    public String nome;
    public int nivel;

    public Usuario(String email, String senha, String nome, int nivel) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
