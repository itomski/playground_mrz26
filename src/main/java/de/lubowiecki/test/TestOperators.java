package de.lubowiecki.test;

public class TestOperators {

    public static void main(String[] args) {

        final int i = 1; // Compiletime-Konstante
        final int j;
        j = 10; // Runtime-Konstante

//        i = 100;
//        j = 100;

        System.out.println(i);
        System.out.println(j);

        boolean f = true;
        if(false == f) {
            System.out.println("...");
        }

        int option = 5;
        switch(option) {

            case 1:
                int k = 100;
                System.out.println("Moin: " + k);
                break;

            case 2:
                k = 200;
                System.out.println("Moin Moin" + k);
                break;

            default:
                k = 300;
                System.out.println("Hallo: " + k);
        }

    }
}
