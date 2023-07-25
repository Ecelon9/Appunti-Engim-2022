package com.example.esempioesametrasporti.model.repository;


import com.example.esempioesametrasporti.model.Fermata;
import com.example.esempioesametrasporti.model.Linea;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LineaRepository {

    static final String DB_URL = "jdbc:mysql://localhost:3306/java";
    static final String USER = "java";
    static final String PASS = "java";

    public static List<Linea> getLinee() {
        // creo la lista da restituire delle linee
        List<Linea> linee = new ArrayList<>();
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("select id, nome from linee");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                // prende la lista delle fermate dando un id di linea
                List<Fermata> fermate = FermataRepository.getFermateByLinea(rs.getInt("id"));

                // creo una linea con i dati del DB
                Linea linea = new Linea(rs.getInt("id"),rs.getString("nome"),fermate);
                // aggiungo alla lista
                linee.add(linea);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return linee;

    }

}
