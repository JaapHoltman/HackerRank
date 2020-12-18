package com.jaapholtman.datastructures;

import java.util.*;

//ik moest twee classes bij voegen, de student 1 en de priorities class. Student1 class maakt gebruik van
//encapsulation en staan de private fields en public methods. Vervolgens moest ik in de priorities class weer
//de compareto gebruiken om de fielden te sorteren. Eerst op cgpa dan op name en dan op id. Ook moest ik gebruik
//maken van de prioritie queue => A priority queue in Java is a special type of queue wherein all the elements
// are ordered as per their natural ordering or based on a custom Comparator supplied at the time of creation.
//The front of the priority queue contains the least element according to the specified ordering, and the
// rear of the priority queue contains the greatest element.
//So when you remove an element from the priority queue, the least element according to the
// specified ordering is removed first.
//The Priority Queue class is part of Java’s collections framework and implements the Queue interface.

public class PriorityQueueProblem {
        private final static Scanner scan = new Scanner(System.in);
        private final static Priorities priorities = new Priorities();

        public static void main(String[] args) {
            int totalEvents = Integer.parseInt(scan.nextLine());
            List<String> events = new  ArrayList<>();

            while (totalEvents-- != 0) {
                String event = scan.nextLine();
                events.add(event);
            }

            List<Student1> students = priorities.getStudents(events);

            if (students.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                for (Student1 st: students) {
                    System.out.println(st.getName());
                }
            }
        }
    }

class Student1 {
    private int token;
    private String fname;
    private double cgpa;

    public Student1(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getToken() {
        return token;
    }
    public String getName() {
        return fname;
    }
    public double getCpga() {
        return cgpa;
    }
}

class Priorities {
    public List<Student1> getStudents(List<String>events) {
        PriorityQueue<Student1>student1_queue = new PriorityQueue(Comparator.comparing(Student1::getCpga).reversed().thenComparing(Student1::getName).thenComparing(Student1::getToken));
        List<Student1>students = new ArrayList<Student1>();
        for (String e : events) {
            Scanner in = new Scanner(e);
            String event = in.next();
            if (event.equals("ENTER")) {
                String name = in.next();
                float cgpa = in.nextFloat();
                int token = in.nextInt();
                Student1 student1 = new Student1(token, name, cgpa);
                student1_queue.add(student1);
            }
            else if (event.equals("SERVED")) {
                Student1 first = student1_queue.poll();
            }
            in.close();
        }
        Student1 first = student1_queue.poll();
        if (first == null) {
            return students;
        }
        else {
            while(first != null) {
                students.add(first);
                first = student1_queue.poll();
            }
            return students;
        }

    }
}

