package com.example.ModelOfEntitys.Entidades;

public class Biblioteca {
    public int quantidadedejogos;
    private int idjogo;

    public Biblioteca(int quantidadedejogos, int idjogo) {
        this.quantidadedejogos = quantidadedejogos;
        this.idjogo = idjogo;
    }

    public int getQuantidadedejogos() {
        return quantidadedejogos;
    }

    public void setQuantidadedejogos(int quantidadedejogos) {
        this.quantidadedejogos = quantidadedejogos;
    }

    public int getIdjogo() {
        return idjogo;
    }

    public void setIdjogo(int idjogo) {
        this.idjogo = idjogo;
    }
}
