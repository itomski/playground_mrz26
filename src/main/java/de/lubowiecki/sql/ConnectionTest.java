package de.lubowiecki.sql;

import java.sql.*;

public class ConnectionTest {

    public static void main(String[] args) {

        // CRUD - Create, Read, Update, Delete


        final String URL = "jdbc:sqlite:data.db";

        // SQLite
        try(Connection conn = DriverManager.getConnection(URL); Statement stmt = conn.createStatement()) {
            System.out.println("Connection erfolgreich!");

//            final String SQL = """
//                                CREATE TABLE kunden (
//                                    id INTEGER PRIMARY KEY AUTOINCREMENT,
//                                    vorname CHAR(25),
//                                    nachname CHAR(25)
//                                )
//                                """;
//
//            stmt.execute(SQL); // Schickt den Befehl an die Datenbank
//            System.out.println("Tabelle wurde erzeugt.");

            // Neuer Datensatz
//            final String SQL = "INSERT INTO kunden (vorname, nachname) VALUES('Bruce', 'Banner')";
//
//            if(stmt.executeUpdate(SQL) > 0)
//                System.out.println("Datensatz wurde gespeichert!");

            // Daten abfragen
//            final String SQL = "SELECT * FROM kunden";
//
//            ResultSet results = stmt.executeQuery(SQL);
//
//            while(results.next()) {
//                System.out.println(results.getInt("id")); // Spaltenname
//                System.out.println(results.getString("vorname"));
//                System.out.println(results.getString("nachname"));
//                System.out.println();
//            }

//            final String SQL = "UPDATE kunden SET vorname = 'Toni' WHERE id = 1";
//
//            if(stmt.executeUpdate(SQL) > 0)
//                System.out.println("Datensatz wurde geändert!");


            final String SQL = "DELETE FROM kunden WHERE vorname = 'Toni' AND nachname = 'Parker' LIMIT 1";

            if(stmt.executeUpdate(SQL) == 1) {
                System.out.println("Datensatz wurde gelöscht!");
            }
            else {
                System.out.println("Kein passender Datensatz gefunden!");
            }


        }
        catch (SQLException e) { // SQLException ist Checked
            e.printStackTrace();
        }
    }
}
