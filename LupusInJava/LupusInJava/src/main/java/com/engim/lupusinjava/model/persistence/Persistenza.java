package com.engim.lupusinjava.model.persistence;

import com.engim.lupusinjava.model.Partita;

import java.util.ArrayList;
import java.util.List;

public class Persistenza {
    private static List<Partita> partite = new ArrayList<>();

    public static List<Partita> getPartite() {
        return partite;
    }
}
