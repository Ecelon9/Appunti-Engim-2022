package com.example.esempioesametrasporti.model;

/*
- Preventivi (id,azienda,piano,max_fermate,max_extraurbane,max_zone,prezzo)*/

public class Preventivo implements Comparable<Preventivo>{

    private int id;
    private String azienda;
    private String piano;
    private int max_fermate;
    private int max_extraurbane;
    private int max_zone;
    private double prezzo;

    public Preventivo(int id, String azienda, String piano, int max_fermate, int max_extraurbane, int max_zone, double prezzo) {
        this.id = id;
        this.azienda = azienda;
        this.piano = piano;
        this.max_fermate = max_fermate;
        this.max_extraurbane = max_extraurbane;
        this.max_zone = max_zone;
        this.prezzo = prezzo;
    }

    public int getId() {
        return id;
    }

    public String getAzienda() {
        return azienda;
    }

    public String getPiano() {
        return piano;
    }

    public int getMax_fermate() {
        return max_fermate;
    }

    public int getMax_extraurbane() {
        return max_extraurbane;
    }

    public int getMax_zone() {
        return max_zone;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "Preventivo{" +
                "id=" + id +
                ", azienda='" + azienda + '\'' +
                ", piano='" + piano + '\'' +
                ", max_fermate=" + max_fermate +
                ", max_extraurbane=" + max_extraurbane +
                ", max_zone=" + max_zone +
                ", prezzo=" + prezzo +
                '}';
    }

    @Override
    public int compareTo(Preventivo o) {
        return (int)(prezzo - o.prezzo);
    }
}
