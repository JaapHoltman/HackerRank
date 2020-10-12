package com.jaapholtman.advanced;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

/*The singleton pattern is a design pattern that restricts
the instantiation of a class to one object. This is useful when exactly one object is
needed to coordinate actions across the system.
Complete the Singleton class in your editor which contains the following components:
A private Singleton non parameterized constructor.
A public String instance variable named str.
Write a static method named getSingleInstance that returns the single instance of the Singleton class.*/

public class SingletonPattern {
    public static void main(String[] args) {

    }
}

    class Singleton{
        private static final Singleton instance = new Singleton();

        private Singleton(){}

        public String str;

        static Singleton getSingleInstance() {
            return instance;
        }


    }

