package com.jaapholtman.strings;

import java.util.Scanner;

public class IntroductionString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length()+B.length());

        int result = A.compareTo(B);

        if (result > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));

    }
}
