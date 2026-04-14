package com.siddhi;
import java.util.*;
public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int salary = sc.nextInt();
        int creditScore = sc.nextInt();

        if(age >=21 && salary>= 25000 && creditScore >=700){
            System.out.println("Loan Approved");
        }
        if(age >=21 && salary>= 25000 && creditScore >=700){
            System.out.println("Loan Approved");
        }else if(age >= 21 && salary >= 25000 && creditScore < 700){
            System.out.println("Improve credit score");
        }
        else if(age >=21 && salary < 25000){
            System.out.println("Salary too low ");
        }
        else if(age <21){
            System.out.println("Young for loan");
        }
    }
}
