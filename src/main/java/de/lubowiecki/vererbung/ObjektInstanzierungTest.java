package de.lubowiecki.vererbung;

public class ObjektInstanzierungTest {

    public static void main(String[] args) {

        AC ac1 = new AC();
        System.out.println(ac1);

    }
}

class AA {

    int zahl1;

    public AA() {
        super();
        System.out.println("C: AA");
    }

    @Override
    public String toString() {
        return "AA";
    }
}

class AB extends AA {

    int zahl2 = zahl1;

    {
        System.out.println("Init: AB");
    }

    public AB() {
        super();
        // Instanzinitializer
        System.out.println("C: AB");
    }

    @Override
    public String toString() {
        return "AB" + super.toString();
    }
}

class AC extends AB {

    // ist zahl2 hier deklariert?
    // Wenn nicht, wird in der Elternklasse nachgeschaut
    int zahl3 = zahl2;

    public AC() {
        super();
        System.out.println("C: AC");
    }

    @Override // Eine geerbte Methode wird ersetzt
    public String toString() {
        return "AC" + super.toString();
    }
}