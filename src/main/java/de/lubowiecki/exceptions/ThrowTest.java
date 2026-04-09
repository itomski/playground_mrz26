package de.lubowiecki.exceptions;

public class ThrowTest {

    public static void main(String[] args) {

        System.out.println(compute(5));

        try {
            System.out.println(compute(2000));
        }
        catch(IllegalArgumentException e) {
            System.out.println("A");
        }
        catch(NullPointerException | ArrayIndexOutOfBoundsException e) { // Multicatch
            System.out.println("AA");
        }
        catch(RuntimeException e) {
            System.out.println("B");
        }
        catch(Exception e) {
            System.out.println("C");
        }
//        catch(Error e) { // Errors sollte nicht behandelt werden. Errors sind uncheckd
//            System.out.println("ERROR");
//        }
    }

    // IllegalArgumentException ist unchecked (throws ist "optional")
    private static int compute(int i) throws IllegalArgumentException {

        return compute(i);

//        if(i <= 0) {
//            // Ungültiger Wert
//            throw new IllegalArgumentException("Der Wert liegt nicht im gültigen Bereich.");
//        }
//        else if(i > 1000) {
//            throw new RuntimeException("Wert zu hoch.");
//        }
//        return i * i;
    }
}
