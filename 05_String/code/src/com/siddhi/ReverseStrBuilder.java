//Reverse a string using StringBuilder
//manual efficient way as it is faster as StringBuilder is mutable
//Reverse a given string
package com.siddhi;
import java.util.*;


public class ReverseStrBuilder {

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i>=0 ;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(reverse(str));
    }
}