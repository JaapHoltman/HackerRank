package com.jaapholtman.intervieuwprep;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

        // Complete the repeatedString function below.
        static long repeatedString(String s, long n) {
            long wholeString = n / s.length();
            int remainderString = (int) (n % s.length());
            long foundA = 0;

            for (char ch : s.toCharArray()) {
                if (ch == 'a')
                    foundA++;
            }

            long total = foundA * wholeString;

            if (remainderString == 0) {
                return total;
            }
            else {
                String partOfString = s.substring(0, remainderString);
                for (char ch : partOfString.toCharArray()) {
                    if (ch == 'a')
                        total++;
                }
            }
            return total;

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String s = scanner.nextLine();

            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long result = repeatedString(s, n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }
    }


