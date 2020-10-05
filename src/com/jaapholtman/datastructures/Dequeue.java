package com.jaapholtman.datastructures;

import java.util.*;

public class Dequeue {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            int[] arr = new int[10000001];
            int n = in.nextInt();
            int m = in.nextInt();
            int max = 0;
            int current_uniques = 0;

            for (int i = 0; i < n; i++) {
                //hier remove je de oude value, mits nodig
                if(i >= m) {
                    int old = deque.removeLast();
                    if (arr[old] >= 1) {
                        arr[old]--;
                        if (arr[old] == 0) {
                            current_uniques--;
                        }
                    }
                }
                //hier add je een nieuwe value
                int num = in.nextInt();
                deque.addFirst(num);
                if (arr[num] == 0) {
                    current_uniques++;
                    //als alle intergers uniek zijn return je de current_uniques
                    if(current_uniques == m) {
                        System.out.println(current_uniques);
                        return;
                    }
                    max = Math.max(max, current_uniques);
                }
                arr[num]++;
            }
            System.out.println(max);
        }
    }
    //andere manier, deze maakt gebruik van hashmap
//     public class test {
//    public static void main(String[] args) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        Deque<Integer> deque          = new ArrayDeque<>();
//
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int m = scan.nextInt();
//        int max = map.size();
//
//        for (int i = 0; i < n; i++) {
//            /* Remove old value (if necessary) */
//            if (i >= m) {
//                int old = deque.remove();
//                if (map.get(old) == 1) {
//                    map.remove(old);
//                } else {
//                    map.put(old, map.get(old) - 1);
//                }
//            }
//            /* Add new value */
//            int num = scan.nextInt();
//            deque.add(num);
//            map.merge(num, 1, Integer::sum);
//
//            max = Math.max(max, map.size());
//
//            /* If all integers are unique, break out of loop */
//            if (max == m) {
//                break;
//            }
//        }
//
//        scan.close();
//        System.out.println(max);
//    }
//}





