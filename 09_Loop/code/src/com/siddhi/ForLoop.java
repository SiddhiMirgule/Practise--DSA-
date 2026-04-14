package com.siddhi;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
//  problem 1:  Print numbers 1 to 10 using for loop
        for(int i = 1 ; i <= 10 ; i++ ){
            System.out.println(i);
        }
//  problem 2:Print only EVEN numbers from 1 to 20 using for loop + if
        for(int i = 1 ; i <= 20 ; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
//  problem 3:Keep asking user to enter a number until they enter 0
//           (use do-while — print each number entered)
        Scanner sc = new Scanner(System.in);
        int num;
        do{
             num = sc.nextInt();
            System.out.println("enter a number until they 0:  ");
        }while(num != 0);

//  Program 4: Print multiplication table of a number entered by user
//           (format: 5 x 1 = 5
//                   5 x 2 = 10  ... up to 5 x 10 = 50...)
        System.out.println("Enter the number u want table : ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(i+" x "+n+" = "+n*i);
        }


        sc.close();
    }
}
