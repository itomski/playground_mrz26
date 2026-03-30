package de.lubowiecki.datentypen;

public class WrapperTest {

    public static void main(String[] args) {

        // byte < short < int < long < float < double
        //         char <

        // Die Promotion bei Wrapper-Typen erfolgt gem. der Klassencherarchie

        byte b = -10;
        int i = b; // primitive widening von byte auf int

        Byte bb = 10;
        //Integer ii = bb; // Komplex Widening geht von Kindklasse auf die Elternklasse (Number)
        Integer ii = bb.intValue(); // Konvertierung mit Methoden möglich

        WrapperTest wt = new WrapperTest(); // Instanz wird für den Aufruf von Instanzmethoden benötigt
        wt.execute(b); // (Instanz-)Methode wird auf der Instanz aufgerufen
        //wt.execute('c');

    }

//    private void execute(byte v) {
//        System.out.println("byte: " + v);
//    }

//    private void execute(short v) {
//        System.out.println("short: " + v);
//    }

//    private void execute(int v) {
//        System.out.println("int: " + v);
//    }

//    private void execute(long v) {
//        System.out.println("long: " + v);
//    }

//    private void execute(double v) {
//        System.out.println("double: " + v);
//    }

    private void execute(byte... v) {
        System.out.println("byte VarArg: " + v);
    }

    private void execute(double... v) {
        System.out.println("double VarArg: " + v);
    }

//    private void execute(Byte... v) {
//        System.out.println("Byte VarArg: " + v);
//    }

//    private void execute(Byte v) {
//        System.out.println("Byte: " + v);
//    }

    private void execute(Integer v) {
        System.out.println("Integer: " + v);
    }

//    private void execute(Number v) {
//        System.out.println("Number: " + v);
//    }

//    private void execute(Object v) {
//        System.out.println("Object: " + v);
//    }

    // Überladen von Methoden
    // gleicher Methodenname
    // unterschiedliche Parameterliste

    // 1. Passende Methode
    // 2. primitive Widening
    // 3. Autoboxing (zum Wrappertyp)
    // 4. Komplex Widening (zum Number oder noch weiter zu Object)
    // 5. primitive VarArg oder Autoboxing VarArg
    // 6. primitive Widening VarArg
    // 7. Error
}
