package com.jaapholtman.objectorientedprogramming;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//nog een voorbeeld van inheritance

    //Write your code here
    class Arithmetic {
        int a;
        int b;

        int add(int a, int b) {
            this.a = a;
            this.b = b;
            int sum = a + b;
            return sum;
        }
        //ik kon het volgende ook gewoon doen:
        //  int add(int a, int b) {
        //    return a+b;
        //  }
    }
    class Adder extends Arithmetic {}

    public class InheritanceTwo{
        public static void main(String []args){
            // Create a new Adder object
            Adder a = new Adder();

            // Print the name of the superclass on a new line
            System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

            // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
            System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
        }
    }

