package de.lubowiecki.classdesign;

public class Konstruktortest {

    public static void main(String[] args) {

        // Instanzierung (new)
        // nt1 ist die Referenz(Stack) auf das NewThing-Objekt(Heap)
        //NextThing nt1 = new NextThing("Hammer", "5kg Vorschlaghammer", 5.5);
//        NextThing nt1 = new NextThing(5.5, "Hammer", "5kg Vorschlaghammer");
//        System.out.println(nt1);

        NextThing nt2 = new NextThing();
        System.out.println(nt2);
        nt2 = null;
        System.gc(); // Aufforderung an den Garbage Collector aktiv zu werden

    }

    static class Inner { // Innere Class
    }
}

class NextThing {

    // String ist ein komplexer Datentyp
    // Komplexe Datentypen bekommen null als Standardwert
    private String name;
    private String description;
    private double weight;
    private Object object;

    // Sobald ein eigener Konstuktor definiert wird, wird kein default Konstruktor bereitgestellt
    public NextThing(String name, String description, double weight) {
        // Wenn kein this oder super in der ersten Zeile steht, wird super aufgerufen
        super(); // wird automatisch benutzt
        System.out.println("K: 3P String, String, double");
        this.name = name;
        this.description = description;
        this.weight = weight;
    }

    public NextThing(double weight, String name, String description) {
        this(name, description, weight); // Verwendet einen anderen Konstruktor dieser Klasse
        System.out.println("K: 3P double, String, String");
    }

    public NextThing() {
        this(0, "Unbekannt", "Unbekannt"); // Verwendet einen anderen Konstruktor dieser Klasse
        // this oder super muss die erste Zeile im Konstruktor sein
        System.out.println("K: 0P");
    }

    // Destruktor
    @Override
    protected void finalize() throws Throwable {
        System.out.println("UGHHHRRRR!!!!!!!");
    }

    @Override
    public String toString() {
        return "NextThing{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", weight=" + weight +
                '}';
    }
}
