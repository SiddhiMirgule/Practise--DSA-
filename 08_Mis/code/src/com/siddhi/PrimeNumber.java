//prime number
package com.siddhi;
import java.util.*;
public class PrimeNumber {

    public static int prime(int n) {
        double num = Math.sqrt(n);
        if(n<= 1){
            System.out.println("not prime");
        }
        if(n ==2 || n ==3){
            System.out.println("prime");
        }
        for(int i = 2; i< num;i++ ){
            if(n%i ==0)
                System.out.println("prime");
        }
        System.out.println("not prime");
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();
        PrimeNumber.prime(n);
    }
}
