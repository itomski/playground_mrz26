package de.lubowiecki.designpatterns.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        EagerSingleton es1 = EagerSingleton.getInstance();
        EagerSingleton es2 = EagerSingleton.getInstance();
        System.out.println(es1 == es2);

        es1.addContent("LINE1, ");
        es2.addContent("LINE2, ");
        check(es1);

        System.out.println(EagerSingleton.getInstance().getContent());
    }

    static void check(EagerSingleton es) {
        EagerSingleton es2 = EagerSingleton.getInstance();
        es.addContent("LINE3, ");
        es2.addContent("LINE4, ");
        EagerSingleton.getInstance().addContent("LINE5, ");
        //EagerSingleton es3 = new EagerSingleton();
        System.out.println(es == es2);
    }
}
