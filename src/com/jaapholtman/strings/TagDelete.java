package com.jaapholtman.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagDelete {
    //je moet de html <> input die binnen komt leesbaar maken. Dus de <> tags verwijderen
    //Ook moet je "none" printen als het geen valid content heeft
        public static void main(String[] args){

            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());
            while(testCases>0){
                String line = in.nextLine();

                boolean matchFound = false;
                Pattern noTagsLine = Pattern.compile("<(.+)>([^<]+)</\\1>");
                Matcher m = noTagsLine.matcher(line);

                while(m.find()) {
                    System.out.println(m.group(2));
                    matchFound = true;
                }
                if(! matchFound) {
                    System.out.println("None");
                }
                testCases--;
            }
        }
    }
    //de regex uitgelegd "<(.+)>([^<]+)</\\1>"
    //<(.+)>
    //matches HTML start tags. The parentheses save the contents inside the brackets into Group #1.
    //([^<]+)
    //matches all the text in between the HTML start and end tags. We place a special restriction on the text in that it can't have the "<" symbol. The characters inside the parenthesis are saved into Group #2.
    //
    //</\\1>
    //is to match the HTML end brace that corresponds to our previous start brace. The \1 is here to match all text from Group #1.





