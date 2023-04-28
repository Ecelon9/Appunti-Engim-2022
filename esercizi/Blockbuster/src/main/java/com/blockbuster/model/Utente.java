package com.blockbuster.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utente implements Serializable {

    private String codiceCliente;
    private String nomeUtente;
    private String filmNoleggiato;

}
