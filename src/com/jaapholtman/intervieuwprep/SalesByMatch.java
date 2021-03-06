package com.jaapholtman.intervieuwprep;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SalesByMatch {

    // Complete the sockMerchant function below, je moet paren van sokken vinden.
    //eerst moet je de array sorteren vervolgens loop je er door heen.
        static int sockMerchant(int n, int[] ar) {
            Arrays.sort(ar);

            int current = ar[0];
            int count = 1;
            int pair = 0;


            for(int i = 1; i < ar.length; i++) {
                if(ar[i] == current) {
                    count++;
                    if(count == 2) {
                        pair++;
                        count = count - 2;
                    }
                } else {
                    current = ar[i];
                    count = 1;
                }
            }
            return pair;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] ar = new int[n];

            String[] arItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arItem = Integer.parseInt(arItems[i]);
                ar[i] = arItem;
            }

            int result = sockMerchant(n, ar);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }
}

