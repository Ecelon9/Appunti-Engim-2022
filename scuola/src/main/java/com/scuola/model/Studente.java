package com.scuola.model;

import java.io.Serializable;

/**
 * Rappresenta la struttura della tabella Studente del DB
 */
public class Studente implements Serializable {

    private String matricolaStudente;
    private String nomeStudente;
    private String cognomeStudente;
    private String cfStudente;
    private String cellulareStudente;

    public Studente() {}

    public Studente(String matricolaStudente, String nomeStudente, String cognomeStudente, String cfStudente, String cellulareStudente) {
        this.matricolaStudente = matricolaStudente;
        this.nomeStudente = nomeStudente;
        this.cognomeStudente = cognomeStudente;
        this.cfStudente = cfStudente;
        this.cellulareStudente = cellulareStudente;
    }

    public String getMatricolaStudente() {
        return matricolaStudente;
    }

    public void setMatricolaStudente(String matricolaStudente) {
        this.matricolaStudente = matricolaStudente;
    }

    public String getNomeStudente() {
        return nomeStudente;
    }

    public void setNomeStudente(String nomeStudente) {
        this.nomeStudente = nomeStudente;
    }

    public String getCognomeStudente() {
        return cognomeStudente;
    }

    public void setCognomeStudente(String cognomeStudente) {
        this.cognomeStudente = cognomeStudente;
    }

    public String getCfStudente() {
        return cfStudente;
    }

    public void setCfStudente(String cfStudente) {
        this.cfStudente = cfStudente;
    }

    public String getCellulareStudente() {
        return cellulareStudente;
    }

    public void setCellulareStudente(String cellulareStudente) {
        this.cellulareStudente = cellulareStudente;
    }
}
