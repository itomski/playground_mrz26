package de.lubowiecki.crypto;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.UUID;

public class UUIDTest {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        String password = "geheim";
        String eingabe = "geheim";

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] hash = md.digest();
        System.out.println(Arrays.toString(hash));
        System.out.println(new BigInteger(1, hash).toString(16));

        md.update(eingabe.getBytes());
        hash = md.digest();
        System.out.println(Arrays.toString(hash));
        System.out.println(new BigInteger(1, hash).toString(16));


//        UUID org = UUID.fromString(UUID als String);
//        System.out.println(org);
//        UUID eingabe = UUID.fromString(UUID als String);
//        System.out.println(eingabe);
//
//        if(org.equals(eingabe))
//            System.out.println("gleich");
//        else
//            System.out.println("ungleich");

    }

}
