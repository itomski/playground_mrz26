package de.lubowiecki.exceptions;

public class ThrowsCheckedTest {

    public static void main(String[] args) {

        System.out.println("main: Start");
        try {
            methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("main: Ende");

    }

    private static void methodA() throws Exception {
        System.out.println("A: Start");
        //try {
        methodB();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        System.out.println("A: Ende");
    }

    // throws gibt die Behandlung an den Aufrufer der Methode weiter
    private static void methodB() throws Exception {
        System.out.println("B: Start");

//        try {
            boolean ok = true;
            if (ok) {
                throw new Exception("Problem"); // Checked
            }
//        }
//        catch(Exception ex) {
//            System.out.println(ex.getMessage());
//        }
        System.out.println("B: Ende");
    }
}

