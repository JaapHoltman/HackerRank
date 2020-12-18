package com.jaapholtman.introduction;

import java.util.Scanner;

public class LoopsI {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int sum;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i = 1; i <= 10; i++) {
            sum = N * i;
            System.out.println(N + " x " + i + " = " + sum);

        }

        scanner.close();
    }
}
