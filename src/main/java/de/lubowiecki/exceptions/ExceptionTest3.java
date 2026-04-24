package de.lubowiecki.exceptions;

public class ExceptionTest3 {

    public static void main(String[] args) {

        machWas(); // KANN: handle or declare

        try {
            machWas(10); // MUSS: handle or declare
        } catch (Exception e) {
            //...
        }
    }

    public static void machWas() throws NullPointerException { // Unchecked
        //...
    }

    public static void machWas(int i) throws Exception { // Checked
        //...
    }
}