package de.lubowiecki.tdd;

import static org.junit.jupiter.api.Assertions.*;

class RechnerTest {

    @org.junit.jupiter.api.Test
    void add() {
        double erwartet = 20;
        double a = 10;
        double b = 10;
        Rechner r = new Rechner();
        double erg = r.add(a, b);
        assertEquals(erwartet, erg);
    }

    @org.junit.jupiter.api.Test
    void sub() {
    }

    @org.junit.jupiter.api.Test
    void div() {
    }

    @org.junit.jupiter.api.Test
    void multi() {
    }
}