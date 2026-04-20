package de.lubowiecki.sql;

import java.sql.SQLException;

public class RepositoryTest {

    public static void main(String[] args) {

        KundenRepository repo = new KundenRepository();

        try {
//            Kunde k = new Kunde("Carol", "Danvers");
//            if(repo.save(k))
//                System.out.println("Kunde wurde gespeichert!");

//            for(Kunde k : repo.findAll()) {
//                System.out.println(k.getId() + ": " + k.getVorname() + " " + k.getNachname());
//            }

//            Kunde k = repo.findAll().getFirst();
//            k.setVorname("Max");
//            k.setNachname("Mustermann");
//            k.setId(3);
//            if(repo.save(k))
//                System.out.println("Kunde wurde verändert.");

            Kunde k = repo.findOneById(2);
            System.out.println(k.getVorname() + " " + k.getNachname());
        }
        catch (SQLException e) {
            System.out.println("Problem beim Schreiben");
        }
    }
}
