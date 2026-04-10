package de.lubowiecki.exceptions;

import javax.sql.rowset.RowSetWarning;
import java.io.IOException;
import java.sql.SQLException;

public class UeberschreibenTest1 {

    public static void main(String[] args) {

        compute(new ClassB());
    }

    static void compute(ClassA a) {
        try {
            a.machWas();
            a.machWasAnderes();

        } catch (Exception e) {
            System.out.println("Problem");
        }
    }

}

abstract class ClassA {

    abstract void machWas() throws Exception; // Checked-Exception

    abstract void machWasAnderes() throws SQLException; // Checked-Exception

}

class ClassB extends ClassA {

    // darf eine Exception weglassen
//    public void machWas() {
//    }

    // darf die gleiche Exception verwenden
//    public void machWas() throws Exception {
//    }

    // Darf eine Kindklasse der Ursprünglichen Exception verwenden
    public void machWas() throws IOException {
    }

//    public void machWasAnderes() { // keine Exception
//    }

//    public void machWasAnderes() throws SQLException { // ursprünglichen Exception
//    }

//    public void machWasAnderes() throws RowSetWarning { // Kindklasse von der ursprünglichen Exception
//    }

//    public void machWasAnderes() throws IOException { // Error: Keine neue CheckedException!!!
//    }

    // UncheckdExceptions (RuntimeException und alle ihre Kindklassen) können verwendet werden
    // Für UncheckdExceptions gibt es keine Pflich zu "handle or declare"
    public void machWasAnderes() throws NullPointerException {
    }
}