package com.jaapholtman.advanced;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/* Let’s suppose you are creating a Java method. However, you are not sure how many arguments your method is
going to accept. To address this problem, Java 1.5 introduced varargs.
Varargs is a short name for variable arguments. In Java, an argument of a method can accept arbitrary
number of values. This argument that can accept variable number of values is called varargs.
The syntax for implementing varargs is as follows:

accessModifier methodName(datatype… arg) {
    // method body
}
In order to define vararg, ... (three dots) is used in the formal parameter of a method.*/

    class Add {
        void add(int ... n) {
            int sum = 0;
            String s = "";
            for (int i : n) {
                sum += i;
                s += i + "+";
            }
            String out = s.substring(0,s.length() - 1) + "=" + sum;
            System.out.println(out);

        }
    }

    public class VarargsExplained {

        public static void main(String[] args) {
            try{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int n1=Integer.parseInt(br.readLine());
                int n2=Integer.parseInt(br.readLine());
                int n3=Integer.parseInt(br.readLine());
                int n4=Integer.parseInt(br.readLine());
                int n5=Integer.parseInt(br.readLine());
                int n6=Integer.parseInt(br.readLine());
                Add ob=new Add();
                ob.add(n1,n2);
                ob.add(n1,n2,n3);
                ob.add(n1,n2,n3,n4,n5);
                ob.add(n1,n2,n3,n4,n5,n6);
                Method[] methods=Add.class.getDeclaredMethods();
                Set<String> set=new HashSet<>();
                boolean overload=false;
                for(int i=0;i<methods.length;i++)
                {
                    if(set.contains(methods[i].getName()))
                    {
                        overload=true;
                        break;
                    }
                    set.add(methods[i].getName());

                }
                if(overload)
                {
                    throw new Exception("Overloading not allowed");
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }




    }



