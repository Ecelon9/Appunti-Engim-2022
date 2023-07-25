package com.example.esamematteob.Repositories;

import com.example.esamematteob.Models.Articolo;

import java.sql.*;
import java.util.ArrayList;
import static com.example.esamematteob.Constants.DBConnection.*;

public class ArticoliRepository {

    public static ArrayList<Articolo> getArticoli() {
        ArrayList<Articolo> articoli = new ArrayList<Articolo>();

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("select * from articolo");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Articolo articolo = new Articolo(
                        rs.getInt("id"),
                        rs.getString("codice"),
                        rs.getString("descrizione"),
                        rs.getFloat("peso"));

                articoli.add(articolo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return articoli;
    }
}
