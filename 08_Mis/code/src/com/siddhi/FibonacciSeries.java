package com.siddhi;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {

    public static int isFibonnaci(int n) {
        if (n <= 1) return n;
        return isFibonnaci(n - 1) + isFibonnaci(n - 2);
    }
    public static int fib(int n , int[]dp){
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] =fib(n-1,dp)+fib(n-2,dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter number : ");
         int n = sc.nextInt();
//        System.out.println( FibonacciSeries.isFibonnaci(n));
         int[] dp = new int[n + 1];
         Arrays.fill(dp, -1);   // initialize with -1

        System.out.println(fib(n, dp));
    }
}
