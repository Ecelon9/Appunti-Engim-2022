package com.example.esempioesametrasporti.model;
/*
- Fermate (id, nome, zona)
*/
public class Fermata {

    private int id;
    private String nome;
    private String zona;


    public Fermata(int id, String nome, String zona) {
        this.id = id;
        this.nome = nome;
        this.zona = zona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Fermata{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", zona='" + zona + '\'' +
                '}';
    }
}
