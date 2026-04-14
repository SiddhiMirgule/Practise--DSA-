package com.siddhi;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks < 0|| marks > 100) {
            System.out.println("Invalid marks");

        } else {

            if      (marks >=90) System.out.println("A - Excellent");
            else if (marks >= 75) System.out.println("B - Good");
            else if (marks >=60) System.out.println("C - Average");
            else if (marks >=40) System.out.println("D - Pass");
            else                   System.out.println("F - Fail");

            String result = (marks >= 40) ? "Pass" : "Fail";
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}