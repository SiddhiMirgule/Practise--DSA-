//Armstrong Number
package com.siddhi;
import java.util.*;

public class Armstrong {
    public static boolean isArmstrong(int n){
        if (n < 0) return false;

        int original = n;


        int digits = 0;
        int temp = n;

        do {
            digits++;
            temp /= 10;
        } while (temp != 0);

        int sum = 0;
        temp = n;


        while (temp > 0) {
            int digit = temp % 10;

            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }

        return sum == original;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (Armstrong.isArmstrong(n))
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}