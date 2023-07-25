package com.example.esamematteob.Repositories;

import com.example.esamematteob.Models.Ordine;

import java.sql.*;
import java.util.ArrayList;
import static com.example.esamematteob.Constants.DBConnection.*;

public class OrdiniRepository {

    public static ArrayList<Ordine> getOrdini() {
        ArrayList<Ordine> ordini = new ArrayList<Ordine>();

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("select * from ordini");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Ordine ordine = new Ordine(
                        rs.getInt("id"),
                        rs.getInt("numero"),
                        rs.getString("data"));

                ordini.add(ordine);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ordini;
    }
}
