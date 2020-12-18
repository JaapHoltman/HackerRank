package com.jaapholtman;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 0;
        int j = 10;
        int count = 0;
        while(i<j) {
            i++;
            j--;
            count++;
        }
        System.out.println("i = "+ i +" j = "+ j +" count =" + count);
    }
}
