package com.scuola.repository.impl;

import com.scuola.constants.URLJDBC;
import com.scuola.model.Scuola;
import com.scuola.repository.ScuolaRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe che implementa l'interfaccia
 */
public class ScuolaRepositoryImpl implements ScuolaRepository {

    @Override
    public List<Scuola> selezioneTutteLeScuole() {
        try {
            Connection conn = DriverManager.getConnection(URLJDBC.URL, URLJDBC.USER, URLJDBC.PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM scuola");
            List<Scuola> scuolaList = new ArrayList<>();

            while(rs.next()) {
                Scuola s = new Scuola(rs.getString("codice_meccanografico"),
                        rs.getString("nome_scuola"),
                        rs.getString("indirizzo_scuola"),
                        rs.getString("tipologia_istituto"),
                        rs.getString("numero_telefono"));
                scuolaList.add(s);

            }
            conn.close();
            return scuolaList;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return null;
    }

    @Override
    public Scuola inserisciScuola(Scuola scuola) {
        return null;
    }

    @Override
    public Scuola modificaScuola(Scuola scuola) {
        return null;
    }

    @Override
    public Boolean eliminaScuola(String codiceMeccanografico) {
        return null;
    }
}
