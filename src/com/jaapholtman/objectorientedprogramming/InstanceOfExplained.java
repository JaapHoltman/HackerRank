package com.jaapholtman.objectorientedprogramming;

import java.util.*;

//The Java instanceof operator is used to test if the object or instance is an instanceof the specified type.

class Student{}
    class Rockstar{}
    class Hacker{}

    public class InstanceOfExplained{

        static String count(ArrayList mylist){
            int a = 0,b = 0,c = 0;
            for(int i = 0; i < mylist.size(); i++){
                Object element=mylist.get(i);
                if(element instanceof Student)//dit moest ik aanpassen
                    a++;
                if(element instanceof Rockstar)//dit moest ik aanpassen
                    b++;
                if(element instanceof Hacker)//dit moest ik aanpassen
                    c++;
            }
            String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
            return ret;
        }

        public static void main(String []args){
            ArrayList mylist = new ArrayList();
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for(int i=0; i<t; i++){
                String s=sc.next();
                if(s.equals("Student"))mylist.add(new Student());
                if(s.equals("Rockstar"))mylist.add(new Rockstar());
                if(s.equals("Hacker"))mylist.add(new Hacker());
            }
            System.out.println(count(mylist));
        }
    }

