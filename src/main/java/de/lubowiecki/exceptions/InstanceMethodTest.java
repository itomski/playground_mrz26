package de.lubowiecki.exceptions;

public class InstanceMethodTest {

    private final static InstanceMethodTest instance = new InstanceMethodTest();

    public static void main(String[] args) {

        // statische Methoden können NUR das statische Inventar (Methoden und Eigenschaften) der Klasse verwenden
        new InstanceMethodTest().start();

        // Zentralles Objekt wird verwendet
        instance.aktionAusfuehren();

        // jedes mal wird ein neues Objekt gebaut
        new InstanceMethodTest().aktionAusfuehren();
        new InstanceMethodTest().aktionAusfuehren();
        new InstanceMethodTest().aktionAusfuehren();

        // Hier wird ein Objekt gebaut
        InstanceMethodTest cet = new InstanceMethodTest();
        cet.aktionAusfuehren();
        cet.aktionAusfuehren();
        cet.aktionAusfuehren();
    }

    private void start() {
        // Instanz-Methoden können das komplette Inventar (Methoden und Eigenschaften) der Klasse verwenden
        aktionAusfuehren();
        aktionAusfuehren();
        aktionAusfuehren();
    }

    void aktionAusfuehren() {
        System.out.println("...");
    }
}