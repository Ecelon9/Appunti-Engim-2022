package com.example.esamematteob.Controller;

import com.example.esamematteob.Models.Articolo;
import com.example.esamematteob.Models.Ordine;
import com.example.esamematteob.Services.ArticoloService;
import com.example.esamematteob.Services.OrdiniService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin("*")
@RestController
public class OrdiniController {

    @GetMapping("/ordini")
    public ArrayList<Ordine> showAllOrdini() {
        try {
            return OrdiniService.getAllOrdini();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return new ArrayList<Ordine>();
        }
    }
}
