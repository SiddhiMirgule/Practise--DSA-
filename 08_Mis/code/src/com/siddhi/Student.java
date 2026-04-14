package com.siddhi;
//Create a program that stores and prints information about a student:
//
//Name (String)
//Age (int)
//Marks in percentage (double)
//Pass or Fail (boolean — use true if marks > 40)
//Section (char — like 'A', 'B', 'C')
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        // Student details
        String name = "Rahul";
        int age = 20;
        double marks = 75.5;
        boolean isPass = marks > 40;
        char section = 'A';

        // Printing the details
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks + "%");
        System.out.println("Pass: " + isPass);
        System.out.println("Section: " + section);
    }
}