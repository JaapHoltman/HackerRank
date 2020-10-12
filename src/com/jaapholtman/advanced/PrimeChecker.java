package com.jaapholtman.advanced;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;
/*You are given a class Solution and its main method in the editor. Your task is to create a class Prime.
The class Prime should contain a single method checkPrime.
The locked code in the editor will call the checkPrime method with one or more integer arguments.
You should write the checkPrime method in such a way that the code prints only the prime numbers.
Please read the code given in the editor carefully. Also please do not use method overloading!*/

    class Prime {
        void checkPrime(int ... num) {
            for(int n : num) {
                if(isPrime(n))
                    System.out.print(n + " ");
            }
            System.out.println();
        }
        Boolean isPrime(int n) {
            if(n < 2) {
                return false;
            }
            for(int i = 2; i <= (int)Math.sqrt(n) && isPrime(i); i++){
                if(n%i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

public class PrimeChecker {

        public static void main(String[] args) {
            try{
                BufferedReader br=new BufferedReader(new InputStreamReader(in));
                int n1=Integer.parseInt(br.readLine());
                int n2=Integer.parseInt(br.readLine());
                int n3=Integer.parseInt(br.readLine());
                int n4=Integer.parseInt(br.readLine());
                int n5=Integer.parseInt(br.readLine());
                Prime ob=new Prime();
                ob.checkPrime(n1);
                ob.checkPrime(n1,n2);
                ob.checkPrime(n1,n2,n3);
                ob.checkPrime(n1,n2,n3,n4,n5);
                Method[] methods=Prime.class.getDeclaredMethods();
                Set<String> set=new HashSet<>();
                boolean overload=false;
                for(int i=0;i<methods.length;i++)
                {
                    if(set.contains(methods[i].getName()))
                    {
                        overload=true;
                        break;
                    }
                    set.add(methods[i].getName());

                }
                if(overload)
                {
                    throw new Exception("Overloading not allowed");
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }



