package de.lubowiecki.classdesign;

public class FahrzeugTest {

    public static void main(String[] args) {


        Fahrzeug f1 = new Fahrzeug("HH-AB", "Ford", "Focus", 2000);
//        f1.kennzeichen = "HH-AB123";
//        f1.marke = "Ford";
//        f1.modell = "Focus";
//        f1.baujahr = 2000;
//        f1.xPos = 0;
//        f1.yPos = 0;

        System.out.println(f1.getKennzeichen());
        System.out.println(f1.getXPos());
        System.out.println(f1.getYPos());
        System.out.println(f1.isAktiv());

        f1.setXPos(-10);
        System.out.println(f1.getXPos());

//        f1.kennzeichen = null;
//        f1.marke = "";


    }
}
