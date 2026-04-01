package de.lubowiecki.kontrollstrukturen;

public class Test1 {

    public static void main(String[] args) {

        int i = -5;

        if(i == 0) System.out.println("0");
        else if(i == 10) System.out.println("10");
        else if(i == 20) System.out.println("20");
        else if(i == 30); // TODO: Bitte einbauen
            //System.out.println("30"); // Error
        else {
            System.out.println("Sonstiges");
        }

        System.out.println(i);

        //System.out.println(if(i == 0) "Ok" else "Nicht Ok"); // Error

        String label;
        if(i == 0)
            label = "OK";
        else
            label = "Nicht Ok";
        System.out.println(label);

        // prüfung ? dann : sonst
        System.out.println(i == 0 ? "OK" : "Nicht Ok");

        System.out.println(i == 0 ? "OK" : (i < 0) ? "kleiner" : "größer");

    }
}
