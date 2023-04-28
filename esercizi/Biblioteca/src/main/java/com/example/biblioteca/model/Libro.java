package com.engim.biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libro {
    private String titolo;
    private String autore;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private Stato stato;

    enum Stato{
        DISPONIBILE, IN_PRESTITO
    }

    public Libro() {
    }

    public Libro(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
        this.stato = Stato.DISPONIBILE;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", id=" + id +
                ", stato=" + stato +
                '}';
    }
}
