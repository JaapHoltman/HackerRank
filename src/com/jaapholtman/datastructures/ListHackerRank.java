package com.jaapholtman.datastructures;

import java.io.*;
import java.util.*;

public class ListHackerRank {

    public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            //n = lengte van list
            int n = scanner.nextInt();
            //List is een interface waar verschillende vormen van listen in staat
            //arraylist linkedlist enzo;
            List<Integer> l = new LinkedList<>();
            //list vullen met loop en gebruik van add method
            for(int i = 0; i < n; i++){
                int value = scanner.nextInt();
                l.add(value);
            }
            //aantal queries(vragen)
            int q = scanner.nextInt();
            for(int i = 0; i < q; i++) {
                String action = scanner.next();
                if(action.equals("Insert")){
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    l.add(x, y);
                } else {
                    int index = scanner.nextInt();
                    l.remove(index);
                }
            }
            scanner.close();
            //dit print de list
            for(Integer num : l){
                System.out.print(num + " ");
            }
        }

}
