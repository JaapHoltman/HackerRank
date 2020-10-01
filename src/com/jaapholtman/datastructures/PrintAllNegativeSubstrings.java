package com.jaapholtman.datastructures;

import java.io.*;
import java.util.*;

public class PrintAllNegativeSubstrings {
    //de eerste input line is de groote van je array, op de tweede line staan de waardes voor in je array.
    //je moet alle aaneen gesloten substing die een negatie sum hebben uitprinten
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int[] array = new int[a];

            for (int i = 0; i < a; i++) {
                array[i] = scanner.nextInt();
            }
            scanner.close();

            int sum = 0;
            int negative_count = 0;

            for (int i = 0; i <= a - 1; i++){
                sum = array[i];
                if (sum < 0) {
                    negative_count++;
                }
                for (int j = i + 1; j < a; j++) {
                    sum += array[j];
                    if (sum < 0) {
                        negative_count++;
                    }
                }
            }
            System.out.println(negative_count);

        }

}
