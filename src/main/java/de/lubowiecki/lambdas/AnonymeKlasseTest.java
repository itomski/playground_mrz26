package de.lubowiecki.lambdas;

public class AnonymeKlasseTest {

    public static void main(String[] args) {

        // Anonyme Klasse = Klasse ohne Namen, die von einem Interface oder einer Klasse erbt
        // Und diese wird sofort instanziert
        Machbar m = new Machbar() {

            @Override
            public boolean machWas() {
                System.out.println("machWas V1");
                return false;
            }

//            @Override
//            public boolean machWasAnderes() {
//                System.out.println("machWasAnderes V1");
//                return false;
//            }
        };

        m.machWas();

        m = new Machbar() {

            @Override
            public boolean machWas() {
                System.out.println("machWas V2");
                return false;
            }

//            @Override
//            public boolean machWasAnderes() {
//                System.out.println("machWasAnderes V2");
//                return false;
//            }
        };

        m.machWas();

        Machbar m2 = () -> {
            System.out.println("Lambda machWas");
            return true;
        };

        m2.machWas();
    }

    NextMachbar nm = new NextMachbar(){};


}

interface Machbar {

    boolean machWas();

    //boolean machWasAnderes();

}

interface NextMachbar {
}
