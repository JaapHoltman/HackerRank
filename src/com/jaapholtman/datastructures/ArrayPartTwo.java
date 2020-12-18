package com.jaapholtman.datastructures;

import java.util.*;

public class ArrayPartTwo {

    public static boolean canWin(int leap, int[] game) {
            // Return true if you can win the game; otherwise, return false.
            return isSolvable(leap, game, 0);
        }
        public static boolean isSolvable(int leap, int[] game, int i) {
            //als je bij het einde bent en je dus gewonne hebt
            if (i >= game.length) {
                return true;
                //als je van het bord bent of op een 1 land wat niet mag
            }
            if (i < 0 || game[i] == 1) {
                return false;
            }
            //als je op een 0 land moet je hem updaten naar een 1
            game[i] = 1;

            return isSolvable(leap, game, i + leap)||
                    isSolvable(leap, game, i + 1)||
                    isSolvable(leap, game, i - 1);

        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int q = scan.nextInt();
            while (q-- > 0) {
                int n = scan.nextInt();
                int leap = scan.nextInt();

                int[] game = new int[n];
                for (int i = 0; i < n; i++) {
                    game[i] = scan.nextInt();
                }

                System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
            }
            scan.close();
        }

}
