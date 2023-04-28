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

    public static Film inserisciFilm(Film film) {
        String sqlQuery = "INSERT INTO blockbuster (" +
                "codice_film," +
                "nome_film," +
                "data_uscita)" +
                "VALUES (" +
                "film.getCodiceFilm()," +
                "film.getNomeFilm()," +
                "film.getDataUscita())";

        try {
            Connection conn = DriverManager.getConnection(URLJDBC.URL, URLJDBC.USER, URLJDBC.PASSWORD);
            Statement stmt = conn.createStatement();
            int row = stmt.executeUpdate(sqlQuery);
            conn.close();
            return film;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return null;
    }

    public static String rimuoviFilm(String nome) {
        try {
            Connection conn = DriverManager.getConnection(URLJDBC.URL, URLJDBC.USER, URLJDBC.PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("DELETE " + nome + " FROM film WHERE nome_film = " + nome);
            conn.close();
            return nome;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return null;
    }


}
