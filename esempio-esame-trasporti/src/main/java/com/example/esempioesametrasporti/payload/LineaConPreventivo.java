package com.example.esempioesametrasporti.payload;

import com.example.esempioesametrasporti.model.Fermata;
import com.example.esempioesametrasporti.model.Linea;
import com.example.esempioesametrasporti.model.Preventivo;

import java.util.List;

public class LineaConPreventivo extends Linea {

    private Preventivo preventivo;

    public LineaConPreventivo(int id, String nome, List<Fermata> fermate, Preventivo preventivo) {
        super(id, nome, fermate);
        this.preventivo = preventivo;
    }

    public LineaConPreventivo(Linea linea, Preventivo preventivo) {
        super(linea.getId(), linea.getNome(), linea.getFermate());
        this.preventivo = preventivo;
    }

    public Preventivo getPreventivo() {
        return preventivo;
    }

    public void setPreventivo(Preventivo preventivo) {
        this.preventivo = preventivo;
    }
}
