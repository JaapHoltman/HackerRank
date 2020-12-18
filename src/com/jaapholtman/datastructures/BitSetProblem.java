package com.jaapholtman.datastructures;

import java.util.BitSet;
import java.util.Scanner;

public class BitSetProblem {
    //Java's BitSet class implements a vector of bit values (i.e.:  ()false or true ()) that grows as needed,
    // allowing us to easily manipulate bits while optimizing space (when compared to other collections).
    // Any element having a bit value of 1 is called a set bit.
    //Given  BitSets, b1 and b2, of size n where all bits in both BitSets are initialized to 0,
    // perform a series of m operations. After each operation, print the number of set bits
    // in the respective BitSets as two space-separated integers on a new line.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//length of bitsets
        int m = scanner.nextInt();//number of operations

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for (int i = 0; i < m; i++) {
             String operator = scanner.next();
             int x = scanner.nextInt();
             int y = scanner.nextInt();

             switch (operator) {
                 case "AND":
                     if (x == 1) {
                         b1.and(b2);
                     }
                     else {
                         b2.and(b1);
                     }
                     break;
                 case "OR":
                     if (x == 1) {
                         b1.or(b2);
                     }
                     else {
                         b2.or(b1);
                     }
                     break;
                 case "XOR":
                     if (x == 1) {
                         b1.xor(b2);
                     }
                     else {
                         b2.xor(b1);
                     }
                     break;
                 case "FLIP":
                     if (x == 1) {
                         b1.flip(y);
                     }
                     else {
                         b2.flip(y);
                     }
                     break;
                 case "SET":
                     if (x == 1) {
                         b1.set(y);
                     }
                     else {
                         b2.set(y);
                     }
                     break;
             }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }


    }
}
