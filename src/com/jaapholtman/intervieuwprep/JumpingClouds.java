package com.jaapholtman.intervieuwprep;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingClouds {

        // Complete the jumpingOnClouds function below.
        static int jumpingOnClouds(int[] c) {
        /*er zijn alleen 1en en nullen en je mag 1 of 2 vakjes vooruit,
        je loopt door de array en als je niet 2 stappen vooruit kan omdat je aan het
         eind bebt i + 2 == c.length of als je niet twee kan springen omdat je op een 1
         land dan spring je 1 (i++) en je telt een jump. als dit niet het geval is kan
          je dus wel 2 springen (i += 2) en tel je alsnog de jump
        */
            int num_jump = 0;
            int i = 0;

            while (i < c.length-1) {
                if (i + 2 == c.length || c[i+2] == 1) {
                    i++;
                    num_jump++;
                } else {
                    i += 2;
                    num_jump++;
                }
            }
            return num_jump;


        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] c = new int[n];

            String[] cItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int cItem = Integer.parseInt(cItems[i]);
                c[i] = cItem;
            }

            int result = jumpingOnClouds(c);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }
    }


