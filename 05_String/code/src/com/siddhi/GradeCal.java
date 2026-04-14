package com.siddhi;
import java.util.*;
public class GradeCal {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if ( marks >=90){
            System.out.println("A — Excellent");
        } else if (marks >=75) {
            System.out.println("B — Good");
        }else if(marks >=60){
            System.out.println("C - Average");
        }else if(marks >=40){
            System.out.println("D — Pass");
        }
        else if(marks < 40){
            System.out.println("F-Fail");
        }
    }

}
