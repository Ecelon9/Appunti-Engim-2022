package com.blockbuster.repository;

import com.blockbuster.constants.URLJDBC;
import com.blockbuster.model.Film;

import java.sql.*;
import java.util.*;

public class FilmRepository {
    public static List<Film> selezionaFilm() {
        try {
            Connection conn = DriverManager.getConnection(URLJDBC.URL, URLJDBC.USER, URLJDBC.PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM film");
            List<Film> listaFilm = new ArrayList<Film>();

            while (rs.next()) {
                Film f = new Film(
                        rs.getString("codice_film"),
                        rs.getString("nome_film"),
                        rs.getString("data_uscita")
                );
                listaFilm.add(f);

            }
            conn.close();
            return listaFilm;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return null;

    }

    public static void inserisciFilm(Film film) {
        try {
            Connection conn = DriverManager.getConnection(URLJDBC.URL, URLJDBC.USER, URLJDBC.PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(
                    "INSERT INTO film (codice_film, nome_film, data_uscita)" +
                        "VALUES (?, ?, ?)"
            );
            pstmt.setString(1, film.getCodiceFilm());
            pstmt.setString(2, film.getNomeFilm());
            pstmt.setString(3, film.getDataUscita());
            int row = pstmt.executeUpdate();
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void rimuoviFilm(String nome) {
        System.out.println(nome);
        try {
            Connection conn = DriverManager.getConnection(URLJDBC.URL, URLJDBC.USER, URLJDBC.PASSWORD);
            Statement stmt = conn.createStatement();
            int row = stmt.executeUpdate("DELETE FROM film WHERE nome_film = " + nome);

            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }


}
