package de.lubowiecki.sql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KundenRepository {

    private static final String URL = "jdbc:sqlite:data.db";

    public void createTable() throws SQLException {

    }

    public Kunde findOneById(int id) throws SQLException {

        try(Connection conn = DriverManager.getConnection(URL); Statement stmt = conn.createStatement()) {

            final String SQL = "SELECT * FROM kunden WHERE id = " + id;

            // Resultset sind relationale Daten
            ResultSet results = stmt.executeQuery(SQL);

            if(results.next()) {
                return create(results);
            }

            return null;
        }
    }

    public List<Kunde> findAll() throws SQLException {

        try(Connection conn = DriverManager.getConnection(URL); Statement stmt = conn.createStatement()) {

            List<Kunde> kunden = new ArrayList<>();

            final String SQL = "SELECT * FROM kunden";

            // Resultset sind relationale Daten
            ResultSet results = stmt.executeQuery(SQL);

            while(results.next()) {
                kunden.add(create(results));
            }

            return kunden;
        }
    }

    private static Kunde create(ResultSet results) throws SQLException {
        Kunde k = new Kunde();
        k.setId(results.getInt("id"));
        k.setVorname(results.getString("vorname"));
        k.setNachname(results.getString("nachname"));
        return k;
    }

    private boolean insert(Kunde kunde) throws SQLException {

        try(Connection conn = DriverManager.getConnection(URL); Statement stmt = conn.createStatement()) {
            final String SQL = "INSERT INTO kunden (vorname, nachname) VALUES('%s', '%s')";
            return stmt.executeUpdate(String.format(SQL, kunde.getVorname(), kunde.getNachname())) > 0;
        }
    }

    private boolean update(Kunde kunde) throws SQLException {
        try(Connection conn = DriverManager.getConnection(URL); Statement stmt = conn.createStatement()) {
            final String SQL = "UPDATE kunden SET vorname = '%s', nachname ='%s' WHERE id = %d";
            return stmt.executeUpdate(String.format(SQL, kunde.getVorname(), kunde.getNachname(), kunde.getId())) > 0;
        }
    }

    public boolean save(Kunde kunde) throws SQLException {
        if(kunde.getId() > 0) {
            return update(kunde);
        }
        else {
            return insert(kunde);
        }
    }

}
