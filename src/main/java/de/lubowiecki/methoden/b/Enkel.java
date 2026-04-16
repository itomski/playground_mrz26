package de.lubowiecki.methoden.b;

import de.lubowiecki.methoden.a.Opa;

public class Enkel extends Opa {

    public static void main(String[] args) {
        Enkel e = new Enkel();
        e.geld -= 100; // Ok, weil main-Methode zu Enkel gehört
    }

    void gibGeldAus(double betrag) {
        this.geld -= betrag; // Vererbung wird genutzt. Enkel erbt von Opa;
    }

    void gibGeldVonOpaAus(double betrag) {
        Opa opa = new Opa();
        // opa.geld -= betrag; // Error: Keine Vererbung! geld nicht sichtbar
    }
}
