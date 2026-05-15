package de.lubowiecki.designpatterns.observer;

// Wird beobachtet
public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();

}
