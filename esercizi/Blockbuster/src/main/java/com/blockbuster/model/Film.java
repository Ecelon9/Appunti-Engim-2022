package com.blockbuster.model;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film implements Serializable {

    private String codiceFilm;
    private String nomeFilm;
    private String dataUscita;


}
