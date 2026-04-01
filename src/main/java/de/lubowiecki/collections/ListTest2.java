package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest2 {

    public static void main(String[] args) {

        // List
        // - Ist geordnet (Einfügereihenfolge)
        // - Hat einen Index
        // - Erlaubt Duplikate

        // ArrayList: Basiert auf einem Array
        // Schneller wahlfreier Zugriff
        // Veränderung mitten drin ist langsam

        // LinkedList: Basiert auf Objekten mit Zeigern zum Nachfolger und Vorgänger
        // Langsamer wahlfreier Zugriff
        // Veränderung mitten drin ist schnell

        // Referenz von Typ ArrayList erlaubt Verweise NUR auf Objekt der ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // list = new LinkedList<>(); // Error: Die Referenz erlaubt nur eine ArrayList

        // Referenz von Typ List erlaubt Verweise auf Objekt verschiedener Listen
        List<Integer> list2 = new ArrayList<>();
        list2 = new LinkedList<>(); // Kein Problem


        String s = "Moin";
        // s = 123; // Integer ist kein String

        Object o = "Moin"; // String ist ein Objekt
        o = 123; // Integer ist auch ein Objekt


        StringBuilder sb = new StringBuilder();
        // sb = "Moin"; // String ist kein StringBuilder

        CharSequence cs = new StringBuilder();
        cs = "Moin";
        // Über die Referenz von CharSequence können nur Methoden benutzt werden, die in CharSequence stehen

    }
}
