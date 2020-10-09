package com.jaapholtman.objectorientedprogramming;

import java.io.*;
import java.util.*;

public class ExceptionHandlingTryCatchExplained {

//Exception handling is the process of responding to the occurrence, during computation,
// of exceptions – anomalous or exceptional conditions requiring special processing –
// often changing the normal flow of program execution. (Wikipedia)
//Java has built-in mechanism to handle exceptions. Using the try statement we can
// test a block of code for errors. The catch block contains the code that says what to do if exception occurs.
// Eigenlijk is het try block gewoon doe dit. Als het niet lukt catch je hem en wordt het catch block uitgevoerd.
// als er ook nog een finally staat, wordt deze altijd uit gevoerd.

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT.
            Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            try {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                System.out.println(x / y);
            }
            catch (InputMismatchException e) {
                System.out.println(e.getClass().getName());
            }
            catch (ArithmeticException e) {
                System.out.println(e.getClass().getName() + ": / by zero");
            }
        }
    }
