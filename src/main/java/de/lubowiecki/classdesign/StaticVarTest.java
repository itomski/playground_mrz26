package de.lubowiecki.classdesign;

public class StaticVarTest {

    public static void main(String[] args) {

        Thing t1 = new Thing("Hammer");
        Thing t2 = new Thing("Tasse");
        Thing t3 = new Thing("Wecker");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        //System.out.println(Thing.getCount());
        System.out.println(t2.getCount());

//        System.out.println(System.getProperties());
//        System.out.println(System.getProperty("java.specification.version"));

    }
}

class Thing {

    // Klassenvariable
    private static int count = 1000;

    // Instanzvariable
    // Instanzvariablen und Klassenvariablen bekommen Standardwerte
    private int id;

    private String title;

    public Thing(String title) {
        this.title = title;
        id = ++count;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return id + ": " + title;
    }
}
