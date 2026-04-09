package de.lubowiecki.exceptions;

public class ThrowsUncheckdTest {

    public static void main(String[] args) {

        System.out.println("main: Start");
        try {
            methodA();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("main: Ende");

    }

    private static void methodA() {
        System.out.println("A: Start");
        //try {
            methodB();
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }
        System.out.println("A: Ende");
    }

    private static void methodB() {
        System.out.println("B: Start");

//        try {
            boolean ok = true;
            if (ok) {
                throw new RuntimeException("Problem"); // Unchecked
            }
//        }
//        catch(RuntimeException ex) {
//            System.out.println(ex.getMessage());
//        }
        System.out.println("B: Ende");
    }
}
