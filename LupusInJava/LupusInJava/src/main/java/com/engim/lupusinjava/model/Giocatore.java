package com.engim.lupusinjava.model;

import java.util.Objects;

public class Giocatore {
    private String nome;
    private Personaggio personaggio;

    public Giocatore(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Giocatore giocatore = (Giocatore) o;

        return Objects.equals(nome, giocatore.nome);
    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }
}
