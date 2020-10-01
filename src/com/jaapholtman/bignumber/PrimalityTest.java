package com.jaapholtman.bignumber;

import java.math.BigInteger;
import java.util.*;

public class PrimalityTest {
    //Input is een int en dan geeft de onderstaande code aan of het een prime number is

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            //String n = scanner.nextLine();
            BigInteger n = new BigInteger(scanner.next());

            System.out.println(n.isProbablePrime(10)?"prime":"not prime");

            scanner.close();
        }


}
