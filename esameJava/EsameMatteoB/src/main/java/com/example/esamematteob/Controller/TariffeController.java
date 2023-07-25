package com.example.esamematteob.Controller;

import com.example.esamematteob.Models.Tariffa;
import com.example.esamematteob.Services.TariffeCorrieriService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin("*")
@RestController
public class TariffeController {

    @GetMapping("/tariffe")
    public ArrayList<Tariffa> showAllTariffe() {
        try {
            return TariffeCorrieriService.getAllTariffe();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return new ArrayList<Tariffa>();
        }
    }

    @GetMapping("/tariffamigliore")
    public float showTariffaMigliori(@RequestParam(value = "pesoOrdine") float pesoOrdine) {
        try {
            return TariffeCorrieriService.getTariffaMiglioreByPeso(pesoOrdine);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return 0.0f;
        }
    }

}
