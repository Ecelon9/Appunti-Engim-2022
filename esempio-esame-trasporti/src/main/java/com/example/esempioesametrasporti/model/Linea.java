package com.example.esempioesametrasporti.model;

import java.util.ArrayList;
import java.util.List;

/*## Tabelle
- Linee (id, nome) */
public class Linea {

    private int id;
    private String nome;
    private List<Fermata> fermate;

    public Linea(int id, String nome, List<Fermata> fermate) {
        this.id = id;
        this.nome = nome;
        this.fermate = fermate;
    }

    public List<Fermata> getFermate() {
        return fermate;
    }

    public void setFermate(List<Fermata> fermate) {
        this.fermate = fermate;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Linea{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", fermate=" + fermate +
                '}';
    }

    public int getNumExtraurbane() {
        int num = 0;
        for (Fermata f : fermate){
            if(!f.getZona().equalsIgnoreCase("U"))
                num++;
        }
        return num;
    }

    public int getNumZone() {
        List<String> zoneIncontrate = new ArrayList<>();
        for (Fermata f : fermate){
            if(!zoneIncontrate.contains(f.getZona()))
                zoneIncontrate.add(f.getZona());
        }
        return zoneIncontrate.size();
    }
}
