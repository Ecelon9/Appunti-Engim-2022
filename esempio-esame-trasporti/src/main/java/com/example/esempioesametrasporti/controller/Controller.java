package com.example.esempioesametrasporti.controller;

import com.example.esempioesametrasporti.model.Fermata;
import com.example.esempioesametrasporti.model.Linea;
import com.example.esempioesametrasporti.model.Preventivo;
import com.example.esempioesametrasporti.model.repository.FermataRepository;
import com.example.esempioesametrasporti.model.repository.LineaRepository;
import com.example.esempioesametrasporti.model.repository.PreventivoRepository;
import com.example.esempioesametrasporti.payload.LineaConPreventivo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    // restituisce le fermate
    @GetMapping("/fermate")
    public List<Fermata> fermate(){
        return FermataRepository.getFermate();
    }

    @GetMapping("/linee")
    public List<LineaConPreventivo> linee(){
        List<Linea> linee = LineaRepository.getLinee();
        List<LineaConPreventivo> lineeConPreventivo = new ArrayList<>();
        List<Preventivo> preventivi = PreventivoRepository.getPreventivi();
        for(Linea linea:linee){
            List<Preventivo> preventiviValidi = new ArrayList<>();
            for(Preventivo preventivo: preventivi) {
                if(preventivoAmmissibile(preventivo,linea)){
                    preventiviValidi.add(preventivo);
                }
            }

           // Preventivo preventivoMigliore = preventiviValidi.stream().min(Preventivo::compareTo);
            Preventivo preventivoMigliore = preventiviValidi.get(0);
            for(Preventivo p : preventiviValidi){
                if(p.getPrezzo() < preventivoMigliore.getPrezzo())
                    preventivoMigliore = p;
            }

            lineeConPreventivo.add(new LineaConPreventivo(linea,preventivoMigliore));


        }
        return lineeConPreventivo;
    }

    private boolean preventivoAmmissibile(Preventivo preventivo, Linea linea) {
//        Preventivi (id,azienda,piano,max_fermate,max_extraurbane,max_zone,prezzo)
        boolean max_fermate = linea.getFermate().size() <= preventivo.getMax_fermate();
        boolean max_extraurbane = linea.getNumExtraurbane() <= preventivo.getMax_extraurbane();
        boolean max_zone = linea.getNumZone() <= preventivo.getMax_zone();

        return max_fermate && max_extraurbane && max_zone;
    }

}
