package de.lubowiecki.aufgaben.a13;

public class InterfaceTest {

    /*
    Schreibe zwei Klassen für ein Gehege in dem unterschiedliche Tiere hinzugefügft werden können.
    1x Fleischfresser und 1x Vegetarier. Realisiert dies als Interface.
    Das Inteface hat eine Methode fressen.
    Schreibe danach 6 Tierklassen von denen 3 Fleischfresser und 3 Vegetarier sind.
    Und 3 die beides sind.
    Teste die Klassen.
     */

    public static void main(String[] args) {

        FleischfresserGehege g1 = new FleischfresserGehege();
        g1.hinzufuegen(new Loewe("Leo"));
        g1.hinzufuegen(new Affe("Bob"));
        g1.hinzufuegen(new Wolf("Lupo"));
        g1.hinzufuegen(new Affe("Charley"));
        //g1.hinzufuegen(new Hase("Bunny"));

        System.out.println(g1);

        System.out.println();

        PflanzenfresserGehege g2 = new PflanzenfresserGehege();
        //g2.hinzufuegen(new Loewe("Leo"));
        g2.hinzufuegen(new Affe("Bob"));
        g2.hinzufuegen(new Hase("Bunny"));

        System.out.println(g2);


        System.out.println();

        AllesfresserGehege g3 = new AllesfresserGehege();
        //g2.hinzufuegen(new Loewe("Leo"));
        g3.hinzufuegen(new Affe("Bob"));
        //g3.hinzufuegen(new Hase("Bunny"));

        System.out.println(g2);
    }
}


