package de.lubowiecki.aufgaben.a17;

import java.util.ArrayList;
import java.util.List;

public class Kaffeautomat {

    private int milch = 100;
    private int kaffee = 100;
    private int wasser = 100;

    private List<String> fehler = new ArrayList<>();

    private double geldEinwurf;

    public void einwurf(double geld) {
        geldEinwurf += geld;
    }

    public void zubereiten(Kaffeeprodukt produkt) {

        fehler.clear();

        if(produkt.getPreis() > geldEinwurf) {
            fehler.add("Zu wenig Geld");
        }
        if(produkt.getKaffeeMenge() > kaffee) {
            fehler.add("Zu wenig Kaffee");
        }
        if(produkt.getWasserMenge() > wasser) {
            fehler.add("Zu wenig Wasser");
        }
        if(produkt.getMilchMenge() > milch) {
            fehler.add("Zu wenig Milch");
        }

        if(fehler.size() > 0) {
            throw new IllegalArgumentException(fehler.toString());
        }
        bestandReduzieren(produkt);
    }

    private void bestandReduzieren(Kaffeeprodukt produkt) {
        kaffee -= produkt.getKaffeeMenge();
        milch -= produkt.getMilchMenge();
        wasser -= produkt.getWasserMenge();
        geldEinwurf -= produkt.getPreis();
    }

    public boolean istGeldVorhanden() {
        return geldEinwurf > 0;
    }

    public double geldAusgeben() {
        double rueckgabe = geldEinwurf;
        geldEinwurf = 0;
        return rueckgabe;
    }
}
