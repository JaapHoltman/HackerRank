package com.jaapholtman.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressiontwo {
    //opdracht is om de dubbele woorden door middel van regular expression weg te halen

        public static void main(String[] args) {

            String regex = "\\b(\\w+)(\\W+\\1\\b)+";//dit is de regular expression
            Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // dit is de flag

            Scanner in = new Scanner(System.in);
            int numSentences = Integer.parseInt(in.nextLine());

            while (numSentences-- > 0) {
                String input = in.nextLine();

                Matcher m = p.matcher(input);

                // Check for subsequences of input that match the compiled pattern
                while (m.find()) {
                    input = input.replaceAll(m.group(), m.group(1));
                    //hier verwijder je de grou(beide woorden) en vervang je ze voor
                    // het eerste woord die je tegen kwam
                }

                // Prints the modified sentence.
                System.out.println(input);
            }

            in.close();
        }

}
