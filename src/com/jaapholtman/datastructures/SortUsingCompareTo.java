package com.jaapholtman.datastructures;

import java.util.*;

    class Student{
        private int id;
        private String fname;
        private double cgpa;
        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getFname() {
            return fname;
        }
        public double getCgpa() {
            return cgpa;
        }
    }

    //Complete the code
    public class SortUsingCompareTo {

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());

            List<Student> studentList = new ArrayList<Student>();
            while(testCases>0){
                int id = in.nextInt();
                String fname = in.next();
                double cgpa = in.nextDouble();

                Student st = new Student(id, fname, cgpa);
                studentList.add(st);

                testCases--;
            }
            //dit gedeelte moest je toevoegen. Ik heb decomparator gebruikt en :: is een method reference
            //ook wel een convinience operator. eerst wordt er gesorteerd op de cgpa score en die word gereversed
            //omdat hij in decresing order moest. Daarna wordt de name vergeleken als ze dezelfde cgpa score hebben,
            // tenslotte de id ook gecompared als de name ook hetzelfde is
            Collections.sort(studentList, Comparator.comparing(Student::getCgpa).reversed()
                    .thenComparing(Student::getFname).thenComparing(Student::getId));

            for(Student st: studentList){
                System.out.println(st.getFname());
            }
        }
    }





