package de.lubowiecki.exceptions;

import java.sql.*;
import java.util.Arrays;

public class CheckedTest {

    public static void main(String[] args) {

        try {
            getData();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        // normales try kann nicht alleine stehen. catch oder finally (der beides) sind nötig
        // try-with-resources darf auch nur try enthalten

        int[] arr = new int[10];
        machWas(arr);

    }

    private static void machWas(int[] arr) {
        try {
            arr[10] = 100;
        }
        finally {
            Arrays.fill(arr, 10);
            System.out.println("Array wurde angepasst");
        }
    }

    private static void getData() throws SQLException {

        // SqlException ist Checked = handle (try-catch) or declare (throws an der Methodensignatur)

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "admin", "geheim");
        Statement stmt = conn.createStatement();
        ResultSet results = stmt.executeQuery("SELECT * FROM users");
        while(results.next()) {
            System.out.println(results.getString("vorname"));
        }

        // TODO: stmt und conn schließen
    }

    private static void getNextData1() {

        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "admin", "geheim");
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("SELECT * FROM users");
            while (results.next()) {
                System.out.println(results.getString("vorname"));
            }
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(stmt != null)
                    stmt.close();

                if(conn != null)
                    conn.close();

            } catch (SQLException e) {
                System.out.println("Problemm beim schließen");
            }
        }
    }

    private static void getNextData() throws SQLException {

        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "admin", "geheim");
            Statement stmt = conn.createStatement()) {

            ResultSet results = stmt.executeQuery("SELECT * FROM users");
            while (results.next()) {
                System.out.println(results.getString("vorname"));
            }

            // Alle Ressourcen (conn und stmt) werden automatisch geschloßen
        }
    }
}
