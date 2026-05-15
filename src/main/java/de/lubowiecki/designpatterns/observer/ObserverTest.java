package de.lubowiecki.designpatterns.observer;

public class ObserverTest {

    public static void main(String[] args) {

        NachrichtenSender sender = new NachrichtenSender();

        Broker max = new Broker("Max");
        Broker peter = new Broker("Peter");
        Broker bruce = new Broker("Bruce");

        SportFan scott = new SportFan("Scott");
        SportFan carol = new SportFan("Carol");

        // Observer werden hinzugefügt
        sender.addObservers(max, peter, bruce);
        sender.addObserver(scott);
        sender.addObserver(carol);

        System.out.println("---------------");
        sender.setMessage("POLITIK: CDU und SPD im Gespräch");
        System.out.println();
        sender.setMessage("WIRTSCHAFT: Apple wieder bei 150 EUR pro Aktie");
        System.out.println();
        sender.setMessage("WIRTSCHAFT: VW deutlich im Minus");
        System.out.println();
        sender.setMessage("SPORT: HSV wieder in der 2.BL");
        System.out.println();
        sender.setMessage("WIRTSCHAFT: ASML wieder bei 1300 EUR pro Aktie");
        System.out.println();
        sender.setMessage("SPORT: Dies und das");

    }
}
