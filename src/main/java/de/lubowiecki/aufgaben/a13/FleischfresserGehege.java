package de.lubowiecki.aufgaben.a13;

import java.util.ArrayList;
import java.util.List;

public class FleischfresserGehege {

    private final List<Fleischfresser> tiere = new ArrayList<>();

    public void hinzufuegen(Fleischfresser tier) {
        tiere.add(tier);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FleischfresserGehege{");
        sb.append("tiere=").append(tiere);
        sb.append('}');
        return sb.toString();
    }
}
