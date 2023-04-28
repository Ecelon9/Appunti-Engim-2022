package com.scuola.repository.impl;

import com.scuola.constants.URLJDBC;
import com.scuola.model.Scuola;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ScuolaRepositoryImpl
{
    public static List<Scuola> selezionaScuole()
    {
        try
        {
            Connection conn = DriverManager.getConnection(URLJDBC.URL, URLJDBC.USER, URLJDBC.PASSWORD);
            Statement stmt = conn.createStatement(); // preparo il comando (query che voglio eseguire)
            ResultSet rs = stmt.executeQuery("SELECT * FROM scuola"); // dichiaro la query
            List<Scuola> scuolaList = new ArrayList<>();

            while (rs.next())
            {
                Scuola s = new Scuola(rs.getString("codice_meccanografico"),
                        rs.getString("nome_scuola"),
                        rs.getString("indirizzo_scuola"),
                        rs.getString("tipologia_istituto"),
                        rs.getString("numero_telefono"));

                scuolaList.add(s);
            }
            conn.close();
            return scuolaList;
        }
        catch (SQLException ex)
        {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return new ArrayList<>();
    }

    public static Scuola inserisciScuola(Scuola scuola)
    {
        String sqlQuery = "INSERT INTO scuola (" +
                "codice_meccanografico, " +
                "nome_scuola, " +
                "indirizzo_scuola, " +
                "tipologia_istituto, " +
                "numero_telefono)" +
                "VALUES(" +
                "scuola.getCodiceMeccanografico(), " +
                "scuola.getNomeScuola(), " +
                "scuola.getIndirizzoScuola(), " +
                "scuola.getTipologiaIstituto(), " +
                "scuola.getNumeroTelefono())";

        try
        {
            Connection conn = DriverManager.getConnection(URLJDBC.URL, URLJDBC.USER, URLJDBC.PASSWORD);

            /*
            PreparedStatement stmt = conn.prepareStatement("Query per il db");
            int row = stmt.executeUpdate();
             */

            Statement stmt = conn.createStatement();
            int row = stmt.executeUpdate(sqlQuery);
            conn.close();
            return scuola;

        }
        catch (SQLException ex)
        {
            // handle any errors
            System.out.println(ex.getMessage());

        }
        return null;

    }

    public static Scuola modificaScuola(Scuola scuola) {
        return null;
    }

    public static Boolean eliminaScuola(String codiceMeccanografico) {
        return null;
    }
}
