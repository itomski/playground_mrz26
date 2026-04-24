package de.lubowiecki.exceptions;

public class DefaultMethodTest {

    public static void main(String[] args) {

        Walk w = new Animal();
        System.out.println(w.getSpeed());

    }
}


class Animal implements Walk, Run {

    @Override
    public int getSpeed() {
        return Walk.super.getSpeed() + Run.super.getSpeed();
    }
}


interface Walk {
    default int getSpeed() {
        return 5;
    }

    default int getTrack() {
        return 200;
    }
}

interface Run {
    public default int getSpeed() {
        return 10;
    }
}
