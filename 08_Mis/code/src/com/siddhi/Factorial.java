//calculate factorial
package com.siddhi;
import java.util.*;
public class Factorial {
    public static int isfact(int n){
        int fact = 1;
        for(int i = 1 ; i < n; i++){
            fact=fact*n;
        }
        return fact ;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(isfact(n));
    }
}
