
package com.siddhi;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("enter operation u want to perform : ");
        String operation= sc.next();
        switch(operation){
            case  "+" -> System.out.println(num1 + num2);
            case "-" -> System.out.println(num1 - num2);
            case "x" -> System.out.println(num1 * num2);
            case "/" -> System.out.println(num1/num2);
            case "%" -> System.out.println(num1 % num2);
            case "e/o"-> {if(num1 % 2 == 0)
                            System.out.println(num1 +" is even");
                            else
                                System.out.println(num1 +" is odd");
                            if(num2 % 2 == 0)
                                System.out.println(num2 +" is even");
                            else
                                System.out.println(num2 +" is odd");
                            }

        }
//        System.out.println((byte) 200);
//        System.out.println((byte) -150);
//        System.out.println((byte) 255);
    }
}
