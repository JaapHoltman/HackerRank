package com.jaapholtman.datastructures;

import java.io.*;
import java.util.*;

public class ArrayListHackerRank {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList[] arrayList = new ArrayList[20000];
            int number_of_lists = scanner.nextInt();

            for (int i = 0; i < number_of_lists; i++) {
                arrayList[i] = new ArrayList();
                int amount_of_numbers_in_list = scanner.nextInt();
                for (int j = 0; j < amount_of_numbers_in_list; j++) {
                    int numbers_in_list = scanner.nextInt();
                    arrayList[i].add(numbers_in_list);
                }
            }
            int queries = scanner.nextInt();
            for (int i = 0; i < queries; i++) {
                int x = scanner.nextInt();//row
                int y = scanner.nextInt();//column
                try {
                    System.out.println(arrayList[x-1].get(y-1));
                } catch(Exception e) {
                    System.out.println("ERROR!");
                }
            }
    }


}
