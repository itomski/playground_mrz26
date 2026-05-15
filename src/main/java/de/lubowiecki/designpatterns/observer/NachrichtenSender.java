package de.lubowiecki.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NachrichtenSender implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private String message = "";

    @Override
    public void addObserver(Observer observer) {
        if(!observers.contains(observer)) // Nur wenn Observer nicht bereits angemeldet
            observers.add(observer);
    }

    public void addObservers(Observer... observerList) {
        for (Observer o : observerList)
            addObserver(o);
    }

    @Override
    public synchronized void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers) {
            o.update(this, message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObserver(); // Nach jeder Änderung die Observer benachrichtigen
    }
}
