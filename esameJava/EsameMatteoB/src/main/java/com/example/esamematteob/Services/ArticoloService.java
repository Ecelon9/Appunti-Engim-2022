package com.example.esamematteob.Services;

import com.example.esamematteob.Models.Articolo;
import com.example.esamematteob.Repositories.ArticoliRepository;

import java.util.ArrayList;

public class ArticoloService {
    public static ArrayList<Articolo> getAllArticoli() {
        return ArticoliRepository.getArticoli();
    }

    public static ArrayList<Articolo> getOrdiniByCodice(String codiceArt) {
        ArrayList<Articolo> articoliByNumero = new ArrayList<Articolo>();
        ArrayList<Articolo> articoli = ArticoliRepository.getArticoli();

        for (Articolo art: articoli) {
            if (art.getCodice().equals(codiceArt)) {
                articoliByNumero.add(art);
            }
        }

        return articoliByNumero;
    }
}
