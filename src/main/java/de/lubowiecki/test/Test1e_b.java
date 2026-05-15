package de.lubowiecki.test;

public class Test1e_b {

    public static void main(String... args) {
        System.out.println("START: Main");
        System.out.println(machWas());
        System.out.println("ENDE: Main");
    }

    static int machWas() {
        //System.exit(50);
        System.out.println("START: machWas");

        try {
            String s = null;
            System.out.println(s.toLowerCase());
            System.out.println("ENDE: machWas");
            return 10;
        }
        finally {
            System.out.println("finally");
            return 20;
        }
    }
}
