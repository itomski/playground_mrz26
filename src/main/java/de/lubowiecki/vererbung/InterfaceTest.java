package de.lubowiecki.vererbung;

public class InterfaceTest {

    public static void main(String[] args) {

        Sender sender = new Sender();

        Brief b = new Brief("Peter", "Bruce", "Marvel-Str. 92, 23456 Marvelhausen", "Bla bla bla");
        sender.sende(b);

        System.out.println();
        EMail mail = new EMail();
        mail.setFrom("p.parker@shield.org");
        mail.setTo("b.banner@shield.org");
        mail.setSubject("Der neue Anzug von Cap. America");
        mail.setBody("Hi. Der Neue Anzug sieht echt lächerlich auch!");
        sender.sende(mail);

        // Nachricht n = new Nachricht(); // Error: Interfaces können nicht direkt instanziert werden

        sender.sende(new Sms("12345678", "34567123", "Das ist ja toll!"));

    }
}

class Sender {

    public void sende(Nachricht n) {
        System.out.println("----- NACHRICHT WIRD VERSCHICKT -----");
        n.versenden(); // Methode wird verwendet
        System.out.println("----- VERSCHICKT -----");
    }
}

interface Nachricht {

    // Alle Attribute im Interface sind automatisch public static final
    // Alle Methoden sind automatisch public

    // Abstrakte Methode (Nur die Signatur wird definiert)
    // Im Interface ist alle public
    // Inteface beschreibt die Anforderungen an die öffentliche Schnittstelle einer Klasse
    void versenden();

}

class Brief implements Nachricht {

    private String absender;
    private String empfaenger;
    private String adresse;
    private String inhalt;

    public Brief(String absender, String empfaenger, String adresse, String inhalt) {
        this.absender = absender;
        this.empfaenger = empfaenger;
        this.adresse = adresse;
        this.inhalt = inhalt;
    }

    @Override
    public void versenden() {
        System.out.println("Brief von " + absender + " an " + empfaenger + " wird per Post verschickt.");
        System.out.println("Adresse: " + adresse);
        System.out.println("Inhalt: " + inhalt);
    }
}

class EMail implements Nachricht {

    private String from;
    private String to;
    private String subject;
    private String body;

    public EMail() {
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public void versenden() {
        System.out.println("Versenden per SMTP");
        System.out.println("Von: " + getFrom());
        System.out.println("An: " + getTo());
        System.out.println("Überschrift: " + getSubject());
        System.out.println("Inhalt: " + getBody());
    }
}

class Sms implements Nachricht {

    private String fromNr;
    private String toNr;
    private String body;

    public Sms(String fromNr, String toNr, String body) {
        this.fromNr = fromNr;
        this.toNr = toNr;
        this.body = body;
    }

    @Override
    public void versenden() {
        System.out.println("SMS von " + fromNr + " an " + toNr + ": " + body);
    }
}