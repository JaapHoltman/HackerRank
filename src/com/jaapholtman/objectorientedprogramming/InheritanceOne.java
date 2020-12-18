package com.jaapholtman.objectorientedprogramming;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//simpel voorbeeld van inheritance, te herkennen aan het extends keyword

    class Animal{
        void walk()
        {
            System.out.println("I am walking");
        }
    }
    class Bird extends Animal
    {
        void fly()
        {
            System.out.println("I am flying");
        }
        void sing() {
            System.out.println("I am singing");
        }
    }

    public class InheritanceOne{

        public static void main(String[] args){

            Bird bird = new Bird();
            bird.walk();
            bird.fly();
            bird.sing();

        }
    }

