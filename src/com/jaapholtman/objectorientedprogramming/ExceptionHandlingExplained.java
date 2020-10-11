package com.jaapholtman.objectorientedprogramming;

import java.util.Scanner;
import java.util.*;

/* Dit is een voorbeeld van exception handinling met het throws keyword */

    class MyCalculatorTwo {

        long power(int n, int p) throws Exception{
            if ( n < 0 || p < 0) {
                throw new Exception("n or p should not be negative.");
            }
            else if (n == 0 && p == 0) {
                throw new Exception("n and p should not be zero.");
            }
            else {
                return (long)Math.pow(n, p);
            }
        }

    }

    public class ExceptionHandlingExplained {
        public static final MyCalculatorTwo my_calculator = new MyCalculatorTwo();
        public static final Scanner in = new Scanner(System.in);

        public static void main(String[] args) {
            while (in .hasNextInt()) {
                int n = in .nextInt();
                int p = in .nextInt();

                try {
                    System.out.println(my_calculator.power(n, p));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
