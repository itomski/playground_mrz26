package de.lubowiecki.io;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SerializeTest {

    public static void main(String[] args) {

        final String FILE = "personen.ser";

        List<Person> personen = new ArrayList<>();

        //fillList(personen);
        //saveToFile(FILE, personen);

        personen = readFromFile(FILE, personen);

        System.out.println(personen);
    }

    private static List<Person> readFromFile(String FILE, List<Person> personen) {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE))) {
            personen = (List<Person>) in.readObject();
        }
        catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return personen;
    }

    private static void saveToFile(String FILE, List<Person> personen) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE))) {
            out.writeObject(personen);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fillList(List<Person> personen) {
        personen.add(new Person("Peter", "Parker", LocalDate.of(1995, 10, 1)));
        personen.add(new Person("Bruce", "Banner", LocalDate.of(1978, 5, 1)));
        personen.add(new Person("Carol", "Danvers", LocalDate.of(1982, 1, 15)));
        personen.add(new Person("Steve", "Rogers", LocalDate.of(1922, 2, 25)));
    }
}

class Person implements Serializable {

    private String vorname;
    private String nachname;
    private LocalDate geburtsdatum;

    public Person() {
    }

    public Person(String vorname, String nachname, LocalDate geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", geburtsdatum=").append(geburtsdatum);
        sb.append('}');
        return sb.toString();
    }
}
