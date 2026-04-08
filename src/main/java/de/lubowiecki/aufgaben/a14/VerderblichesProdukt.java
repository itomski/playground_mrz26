package de.lubowiecki.aufgaben.a14;

import java.time.LocalDate;

public class VerderblichesProdukt extends Produkt {

    private LocalDate mhd;

    public VerderblichesProdukt(String name, String beschreibung, int menge, double price, LocalDate mhd) {
        super(name, beschreibung, menge, price);
        this.mhd = mhd;
    }

    public LocalDate getMhd() {
        return mhd;
    }
}
