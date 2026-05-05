package de.lubowiecki.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class PrintGroup implements Printable {

    // Loose Coupling - Verwendung von Interfaces statt konkreter Klassen
    private List<Printable> docs = new ArrayList<>();

    public void addDocs(Printable... docs) {
        this.docs.addAll(List.of(docs));
    }

    @Override
    public void print() {
        for(Printable p : docs) {
            p.print();
        }
    }
}
