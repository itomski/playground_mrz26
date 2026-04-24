package de.lubowiecki.vererbung;

public class AbstractTest {
}

class Basic {

    int machWas() {
        return 10;
    }

    int machWasAnderes() {
        return 100;
    }
}

abstract class NextLevel extends Basic {

    abstract int machWasGanzAnderes();

    final int x;

    public NextLevel(int i) {
        x = i;
        System.out.println("C: NextLevel");
    }
}

class SuperLevel extends NextLevel  {


    public SuperLevel() {
        super(10);
    }

    @Override
    int machWasGanzAnderes() {
        return 200;
    }
}