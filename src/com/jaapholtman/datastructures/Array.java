package com.jaapholtman.datastructures;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            //hier maak je een array aan met de lengte van n
            int[] a = new int[n];
            //hier vul je de array
            for(int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }

            scan.close();

            // Prints each sequential element in array a
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }

}
