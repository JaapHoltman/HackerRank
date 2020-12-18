package com.jaapholtman.strings;

import java.util.Scanner;

//de class usernamevalidator kijkt door middel van een regular expression of de
//input voldoet aan de voorwaarden die de regex stelt
//handige site is regex101.com

    class UsernameValidator {

        public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";//regex
    }


    public class ValidUsernameCheckerRegEx {
        private static final Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
            int n = Integer.parseInt(scan.nextLine());
            while (n-- != 0) {
                String userName = scan.nextLine();

                if (userName.matches(UsernameValidator.regularExpression)) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            }
        }

}
