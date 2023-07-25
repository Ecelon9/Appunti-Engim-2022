package com.example.esamematteob.Services;

import com.example.esamematteob.Models.Ordine;
import com.example.esamematteob.Repositories.OrdiniRepository;

import java.util.ArrayList;

public class OrdiniService {
    public static ArrayList<Ordine> getAllOrdini() {
        return OrdiniRepository.getOrdini();
    }

    public static ArrayList<Ordine> getOrdiniByNumero(int numeroOrdine) {
        ArrayList<Ordine> ordiniByNumero = new ArrayList<Ordine>();
        ArrayList<Ordine> ordini = OrdiniRepository.getOrdini();

        for (Ordine ord: ordini) {
            if (ord.getNumero() == numeroOrdine) {
                ordiniByNumero.add(ord);
            }
        }

        return ordiniByNumero;
    }


}
