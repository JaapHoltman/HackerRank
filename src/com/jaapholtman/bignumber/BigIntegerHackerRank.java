package com.jaapholtman.bignumber;

import javax.sound.midi.Soundbank;
import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerHackerRank {
    //BigInteger is een doos waar je enorme getallen in kan stoppen die de long
    // niet aan kunnen. Bij BigInteger moet je methods gebruiken om te vermenigvuldigen enzo

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());

        BigInteger sum_add;
        sum_add = a.add(b);

        BigInteger sum_multiply;
        sum_multiply = a.multiply(b);

        System.out.println(sum_add);
        System.out.println(sum_multiply);

        //dit was sneller geweest, dan had je de sum niet nodig.
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

        scanner.close();
    }
}
