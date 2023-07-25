package com.example.esamematteob.Repositories;

import com.example.esamematteob.Models.Tariffa;

import java.sql.*;
import java.util.ArrayList;

import static com.example.esamematteob.Constants.DBConnection.*;

public class TariffeCorrieriRepository {

    public static ArrayList<Tariffa> getTariffe() {
        ArrayList<Tariffa> tariffeCorrieri = new ArrayList<Tariffa>();

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("select * from tariffe_corrieri");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Tariffa tariffa = new Tariffa(
                        rs.getInt("id"),
                        rs.getString("nome_corriere"),
                        rs.getString("nome_tariffa"),
                        rs.getFloat("peso_massimo"),
                        rs.getFloat("costo"));

                tariffeCorrieri.add(tariffa);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tariffeCorrieri;
    }
}
