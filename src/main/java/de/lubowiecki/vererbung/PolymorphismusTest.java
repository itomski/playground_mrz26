package de.lubowiecki.vererbung;

public class PolymorphismusTest {

    public static void main(String[] args) {

        //machWas(new Thing());
        machWas(new NextThing());

    }

    public static void machWas(Thing t) {

        System.out.println(t.name);
        System.out.println(t.getName());
        System.out.println(t.getZahl());
        System.out.println(t.getAndereZahl());

    }
}

class Thing {

    public String name = "Thing";
    private int zahl = 100;

    public String getName() {
        return name;
    }

    public int getZahl() {
        return zahl;
    }

    public int getAndereZahl() {
        return 100;
    }
}

class NextThing extends Thing {

    public String name = "NextThing";
    private int zahl = 200;

    @Override
    public int getAndereZahl() {
        return 200;
    }

}