package de.lubowiecki.designpatterns.observer;

public class Broker implements Observer {

    private String name;

    public Broker(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject obj, String msg) {
        if(msg.startsWith("WIRTSCHAFT"))
            System.out.println(name + ": Es gibt eine neue Wirtschaftsnachricht - " + msg);
    }
}
