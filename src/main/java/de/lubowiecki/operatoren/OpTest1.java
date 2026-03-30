package de.lubowiecki.operatoren;

public class OpTest1 {

    public static void main(String[] args) {

        System.out.println(1 + 3 * 2); // 7 als int
        System.out.println((1 + 3) * 2); // 8 als int
        System.out.println("1" + 3 + 2); // 132 als String
        System.out.println("1" + 3 * 2); // 16 als String
        //System.out.println(("1" + 3) * 2); // Error: * für String ist nicht erlaubt

        //4: 00000000 00000000 00000000 00000100
        //7: 00000000 00000000 00000000 00000111

        System.out.println(3 >> 4 + 2);


        System.out.println(7 & 4); // AND
        //E: 00000000 00000000 00000000 00000100

        System.out.println(7 | 4); // OR
        //E: 00000000 00000000 00000000 00000000 00000111

        System.out.println(7 ^ 4); // XOR
        //E: 00000000 00000000 00000000 00000000 00000011

        System.out.println(~7); // NOT
        System.out.println(~0b00000111); // NOT
        //E: 11111111 11111111 11111111 11111000

        System.out.println(Integer.toBinaryString(7));

        int i = 10;
        int j = 20;
        //        10  + 7 + 19 + 12
        int erg = i + + 7 + --j + ++i;
        System.out.println(erg);

        i = 10;
        j = 20;
        //   10  + 7 + 19  + 11
        i = i++ + 7 + --j + i++; // letztes Postfix wird durch Zuweisung überschrieben
        System.out.println(i);
        i += 1;
        System.out.println(i);

        byte b = 10;

        b++; // b = (byte)(b + 1)
        b += 3; // b = (byte)(b + 3)
        b = (byte)(b + 1); // Casting muss per Hand erfolgen
        System.out.println();

        i = 10;
        j = 15;

        if(++i > 10 | j++ == 15) {
            System.out.println(i + j);
        }
    }

}
