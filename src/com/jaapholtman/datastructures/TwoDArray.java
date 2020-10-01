package com.jaapholtman.datastructures;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoDArray {
    private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int[][] arr = new int[6][6];

            for (int i = 0; i < 6; i++) {
                String[] arrRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 6; j++) {
                    int arrItem = Integer.parseInt(arrRowItems[j]);
                    arr[i][j] = arrItem;
                }
            }

            scanner.close();

            int max_hourglass_sum= -63;
            // int maxhourglass is -63 omdat er 7 rijen van 6 zijn, 63 dus
            //row is links naar rechts, kollom is van boven naar beneden
            // int i is een rij en int j is een kollom, die ga je met de loop steeds langs, je gaat tot 3 omdat de array
            //6 lang is en je hourglass 3 breed dus je gaat max tot 3 anders indexoutofbounds.
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    int current_sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                    if (current_sum > max_hourglass_sum) {
                        max_hourglass_sum = current_sum;
                    }
                }
            }
            System.out.println(max_hourglass_sum);

        }
    }


