package com.jaapholtman.strings;

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s =s.trim();

        if(s.length() == 0) {
            System.out.println(0);
            return;
        }


        String[] s_split_into_words = s.split("[^A-Za-z]+");
        System.out.println(s_split_into_words.length);

        for(String s_split_into_word : s_split_into_words) {
            System.out.println(s_split_into_word);
        }

        scan.close();
    }
}
