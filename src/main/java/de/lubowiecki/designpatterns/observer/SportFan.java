package de.lubowiecki.designpatterns.observer;

public class SportFan implements Observer {

    private String name;

    private int count = 0;

    public SportFan(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject obj, String msg) {
        if(msg.startsWith("SPORT")) {
            System.out.println(name + ": Es gibt eine neue Sportnachricht - " + msg);
            count = 0;
        }
        else {
            count++;
        }

        if(count == 3) {
            obj.removeObserver(this); // Observer meldet sich ab
            System.out.println(name + ": Kein Bock mehr");
        }
    }
}
