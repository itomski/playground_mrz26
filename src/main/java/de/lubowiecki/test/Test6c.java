package de.lubowiecki.test;

public class Test6c {

    static int i = 100;
    int j = 100;

    public static void main(String[] args) {
        new Test6c().start();

        // Object = Referenztyp
        // Integer = Objekttyp
        Object o = new Integer(10);
        // statische Methoden werden IMMER auf dem Referenztyp ausgeführt
        // Instanz-Methoden werden IMMER auf dem Objekttyp ausgeführt

    }

//    public static void main(String args[]) {
//        String eFood = "Corn";
//        System.out.println(eFood);
//        eFood = mix(eFood);
//        System.out.println(eFood);
//    }
    static String mix(String foodIn) {
        foodIn = foodIn.concat("A");
        foodIn = foodIn.replace('C', 'B');
        return foodIn;
    }

    void start() {
        int j = 200; // Shadowing für die Instanzvariable j
        System.out.println(j);
        System.out.println(this.j); // Zugriff auf die Instanzvariable

        //int j = 300; // Redeklaration, nicht erlaubt
        {
            //int j = 400; // Redeklaration im Block, nicht erlaubt
            j = 400; // Verändert die lokale Variable. OK
            int k = 250; // Lokale Variable hat NUR den Scope des Blocks
            {
                // hier ist die Variable aus dem Block noch sichtbar
                //int k = 270; // Redeklaration nicht erlaubt
            }
        }

        // k aus dem Block ist hier out-of-scope (ist weg)
        int k = 350;
    }
}

class A1 {
    private int i = 100;
    int j = 200; // package-private

    public int getI() {
        return i;
    }
}

class A2 extends A1 {

    void show() {
        //System.out.println(i); // Error:  i ist privat und wird nicht vererbt
        System.out.println(getI()); // getI() ist public und wird vererbt
        System.out.println(j); // j ist durch Vererbung sichtbar
    }
}
