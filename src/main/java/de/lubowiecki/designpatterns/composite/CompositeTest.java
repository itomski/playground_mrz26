package de.lubowiecki.designpatterns.composite;

public class CompositeTest {

    public static void main(String[] args) {

        // Composite
        // Auf einer Gruppe von Objekten kann eine Aktion so ausgeführt werden, wie auf einem einzelnen Objekt

        WordDoc w = new WordDoc();
        w.setTitle("Kochen ohne Fett");
        w.setContent("Das ist ein Buch über das Kochen ohne Einsatz von Fett.");
        //w.print();

        System.out.println();

        PowerPointDoc pp = new PowerPointDoc();
        pp.setTitle("Vorstandssitzung");
        pp.setSlides("Seite 1", "Seite 2", "Seite 3");
        //pp.print();

        System.out.println();

        ExcelDoc e = new ExcelDoc();
        e.setTitle("Auswertung");
        e.setTabelle(new String[][]{
                {"Peter", "Parker", "1.000.000,00 €"},
                {"Bruce", "Banner", "20,00 €"},
                {"Steve", "Rogers", "-200,00 €"},
        });
        //e.print();

        PrintGroup group1 = new PrintGroup();
        group1.addDocs(w, e);
        group1.addDocs(pp);
        //group1.print();

        PrintGroup group2 = new PrintGroup();
        WordDoc w2 = new WordDoc();
        w2.setTitle("Kochen ohne Mehl");
        w2.setContent("Das ist ein Buch über das Kochen ohne Einsatz von Mehl.");
        WordDoc w3 = new WordDoc();
        w3.setTitle("Backen ohne Mehl");
        w3.setContent("Das ist ein Buch über das Backen ohne Einsatz von Mehl.");

        group2.addDocs(w2, w3);

        group1.addDocs(group2);
        //group1.addDocs("Moin");
        group1.print();
    }
}
