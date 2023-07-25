package com.example.esempioesametrasporti.model.repository;


import com.example.esempioesametrasporti.model.Fermata;
import com.example.esempioesametrasporti.model.Preventivo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PreventivoRepository {


    static final String DB_URL = "jdbc:mysql://localhost:3306/java";
    static final String USER = "java";
    static final String PASS = "java";
    public static List<Preventivo> getPreventivi(){
        // creo una lista da restituire
        List<Preventivo> preventivi = new ArrayList<>();
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("select id,azienda,piano,max_fermate,max_extraurbane,max_zone,prezzo from preventivi");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                // creo un preventivo con i dati del DB

                Preventivo preventivo = new Preventivo(
                        rs.getInt("id"),
                        rs.getString("azienda"),
                        rs.getString("piano"),
                        rs.getInt("max_fermate"),
                        rs.getInt("max_extraurbane"),
                        rs.getInt("max_zone"),
                        rs.getDouble("prezzo")
                );
                // aggiungo alla lista
                preventivi.add(preventivo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //restituisco la lista
        return preventivi;
    }

}
