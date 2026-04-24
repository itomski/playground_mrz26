package de.lubowiecki.test;

import java.util.Objects;

public class EqualsTest {

    public static void main(String[] args) {

        NextTest t1 = new NextTest(10);
        NextTest t2 = new NextTest(10);

        System.out.println(t1.equals(t2));
        System.out.println(t1 == t2);
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());


    }
}

class NextTest {

    private int i;

    public NextTest(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NextTest nextTest = (NextTest) o;
        return i == nextTest.i;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(i);
    }
}
