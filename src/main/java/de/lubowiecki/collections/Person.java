package de.lubowiecki.collections;

public class Person implements Comparable<Person> {

    private static int count;

    private int id;
    private String vorname;
    private String nachname;
    private int alter;

    public Person(String vorname, String nachname, int alter) {
        this.id = ++count;
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    public int getId() {
        return id;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id=").append(id);
        sb.append(", vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", alter=").append(alter);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Person other) { // Natürliche Reihenfolge
        // Vergleicht dieses Objekt mit einem anderen
        // Minuswert = kleiner
        // Pluswert = größer
        // 0 = Gleich
        //return alter - other.alter; // Nach Alter

        int erg = vorname.compareTo(other.vorname); // Nach Vorname
        if(erg == 0){ // Bei Gleichheit
            erg = nachname.compareTo(other.nachname); // Nach Nachname
        }
        return erg;
    }
}
