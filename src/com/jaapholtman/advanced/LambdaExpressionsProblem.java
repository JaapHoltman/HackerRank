package com.jaapholtman.advanced;

import java.io.*;
import java.util.*;

/*Java lambda expressions are Java's first step into functional programming. A Java lambda
expression is thus a function which can be created without belonging to any class. ...
Java lambda expressions are commonly used to implement simple event listeners /
callbacks, or in functional programming with the Java Streams AP*/

    interface PerformOperation {
        boolean check(int a);
    }
    class MyMath {
        public static boolean checker(PerformOperation p, int num) {
            return p.check(num);
        }

        // Write your code here
        public static PerformOperation isOdd() {
            return (int a) -> a % 2 != 0;
        }
        public static PerformOperation isPrime() {
            return (int a) -> java.math.BigInteger.valueOf(a).isProbablePrime(1);
        }
        public static PerformOperation isPalindrome() {
            return (int a) -> Integer.toString(a).equals( new StringBuilder(Integer.toString(a)).reverse().toString() );
        }
    }

public class LambdaExpressionsProblem {

        public static void main(String[] args) throws IOException {
            MyMath ob = new MyMath();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());
            PerformOperation op;
            boolean ret = false;
            String ans = null;
            while (T--> 0) {
                String s = br.readLine().trim();
                StringTokenizer st = new StringTokenizer(s);
                int ch = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                if (ch == 1) {
                    op = ob.isOdd();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "ODD" : "EVEN";
                } else if (ch == 2) {
                    op = ob.isPrime();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PRIME" : "COMPOSITE";
                } else if (ch == 3) {
                    op = ob.isPalindrome();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

                }
                System.out.println(ans);
            }
        }
    }


