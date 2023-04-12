package com.scuola.repository;

import com.scuola.model.Scuola;

import java.util.List;

/**
 * Metodi per le scuole esistenti nel DB
 */
public interface ScuolaRepository {

    /**
     * Seleziona tutte le scuole esistenti nel DB
     * @return lista di scuole
     */
    List<Scuola> selezioneTutteLeScuole();

    /**
     * Inserisce un'istanza di scuola nel DB
     * @param scuola istanza di scuola da inserire
     * @return istanza della scuola creata
     */
    Scuola inserisciScuola(Scuola scuola);

    /**
     * Modifica una scuola presente nel DB
     * @param scuola istanza di scuola da modificare
     * @return istanza di scuola modificata
     */
    Scuola modificaScuola(Scuola scuola);

    /**
     * Elimina una scuola presente nel DB
     * @param codiceMeccanografico codice univoco della scuola (primary key scuola)
     * @return conferma della rimozione
     */
    Boolean eliminaScuola(String codiceMeccanografico);

}
