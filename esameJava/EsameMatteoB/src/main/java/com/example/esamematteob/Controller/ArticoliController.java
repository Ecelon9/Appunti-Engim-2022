package com.example.esamematteob.Controller;

import com.example.esamematteob.Models.Articolo;
import com.example.esamematteob.Models.Tariffa;
import com.example.esamematteob.Services.ArticoloService;
import com.example.esamematteob.Services.TariffeCorrieriService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin("*")
@RestController
public class ArticoliController {

    @GetMapping("/articoli")
    public ArrayList<Articolo> showAllArticoli() {
        try {
            return ArticoloService.getAllArticoli();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return new ArrayList<Articolo>();
        }
    }
}
