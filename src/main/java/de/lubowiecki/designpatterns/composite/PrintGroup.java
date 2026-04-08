package de.lubowiecki.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class PrintGroup implements Printable {

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
