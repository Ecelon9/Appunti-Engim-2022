package com.engim.esempiorest.model;

import java.util.ArrayList;
import java.util.List;

public class Nomi {

    private static List<String> nomi = new ArrayList<>();


    public static List<String> getNomi() {
        return nomi;
    }

    public static List<String> getNomiById(int id) {
        return nomi;
    }

    public static void setNome(String nomi) {
        Nomi.nomi.add(nomi);
    }

    public static void removeNome(String nomi) {
        Nomi.nomi.remove(nomi);
    }
}
