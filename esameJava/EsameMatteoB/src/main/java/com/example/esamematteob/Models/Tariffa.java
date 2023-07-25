package com.example.esamematteob.Models;

public class Tariffa {
    private int id;
    private String nomeCorriere;
    private String nomeTariffa;
    private float pesoMax;
    private float costo;

    public Tariffa(int id, String nomeCorriere, String nomeTariffa, float pesoMax, float costo) {
        this.id = id;
        this.nomeCorriere = nomeCorriere;
        this.nomeTariffa = nomeTariffa;
        this.pesoMax = pesoMax;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCorriere() {
        return nomeCorriere;
    }

    public void setNomeCorriere(String nome_corriere) {
        this.nomeCorriere = nomeCorriere;
    }

    public String getNomeTariffa() {
        return nomeTariffa;
    }

    public void setNomeTariffa(String nomeTariffa) {
        this.nomeTariffa = nomeTariffa;
    }

    public float getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double peso_max) {
        this.pesoMax = pesoMax;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
}
