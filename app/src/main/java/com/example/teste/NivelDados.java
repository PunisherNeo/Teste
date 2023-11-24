package com.example.teste;

public class NivelDados {
    private int level;
    private Integer frags;
    private Integer prata; // Usamos Integer para permitir valores nulos
    private Integer ouro; // Usamos Integer para permitir valores nulos

    public NivelDados(int level, Integer frags, Integer prata, Integer ouro) {
        this.level = level;
        this.frags = frags;
        this.prata = prata;
        this.ouro = ouro;
    }

    public NivelDados() {

    }

    // Getters para acessar os valores
    public int getLevel() {
        return level;
    }

    public int getFrags() {
        return frags;
    }

    public Integer getPrata() {
        return prata;
    }

    public Integer getOuro() {
        return ouro;
    }

    public NivelDados NivelDados(int nivelAtual) {
        return null;
    }
}