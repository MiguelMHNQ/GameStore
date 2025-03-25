package com.example.ModelOfEntitys.Entidades;

public class Jogos {
    public String nome;
    public String descricao;
    public float preco;
    private boolean promocao;

    public Jogos(String nome, String descricao, float preco, boolean promocao) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.promocao = promocao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }
}
