package com.example.ModelOfEntitys.Entidades;

public class Amigos {
    public int quantidadedeamigos;
    private int idamigo;
    public float amizade;

    public Amigos(int quantidadedeamigos, int idamigo, float amizade) {
        this.quantidadedeamigos = quantidadedeamigos;
        this.idamigo = idamigo;
        this.amizade = amizade;
    }

    public int getQuantidadedeamigos() {
        return quantidadedeamigos;
    }

    public void setQuantidadedeamigos(int quantidadedeamigos) {
        this.quantidadedeamigos = quantidadedeamigos;
    }

    public int getIdamigo() {
        return idamigo;
    }

    public void setIdamigo(int idamigo) {
        this.idamigo = idamigo;
    }

    public float getAmizade() {
        return amizade;
    }

    public void setAmizade(float amizade) {
        this.amizade = amizade;
    }
}
