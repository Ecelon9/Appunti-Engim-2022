package com.example.esamematteob.Services;

import com.example.esamematteob.Models.Tariffa;
import com.example.esamematteob.Repositories.TariffeCorrieriRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TariffeCorrieriService {
    public static ArrayList<Tariffa> getAllTariffe() {
        return TariffeCorrieriRepository.getTariffe();
    }

    public static float getTariffaMiglioreByPeso (float pesoOrdine) throws Exception {
        ArrayList<Tariffa> tariffe = TariffeCorrieriRepository.getTariffe();
        float tariffaMigliore = Float.POSITIVE_INFINITY;

        for (Tariffa tar : tariffe) {
            if (tar.getCosto() <= tariffaMigliore && tar.getPesoMax() >= pesoOrdine) {
                tariffaMigliore = tar.getCosto();
            }
        }

        if(tariffaMigliore == Float.POSITIVE_INFINITY) {
            throw new Exception("Tariffa non trovata");
        }

        return tariffaMigliore;
    }
}
