package de.lubowiecki; // Nur max. ein package Statement pro Source-File

// Top-Level-Class: Nur ein public Top-Level-Class pro Source-File
// Top-Level-Class bestimmt den Namen der .java Datei
// Top-Level Klassen dürfen nur public oder package-private sein
class ClassesTests {

    public static void main(String[] args) {
        System.out.println("A");
    }
}

// 0 oder mehrere Nicht public Klassen
class ClassesTest2 {

    public static void main(String[] args) {
        System.out.println("B");
    }
}

interface InterTest {

    public static void main(String[] args) {
        System.out.println("C");
    }
}