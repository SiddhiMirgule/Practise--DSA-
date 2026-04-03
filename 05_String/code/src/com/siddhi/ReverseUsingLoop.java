package com.siddhi;
//reverse a string using loop

public class ReverseUsingLoop {

    public static String reverse(String str){
        String reverseStr="";
        for(int i = str.length()-1 ; i >=0 ;i--){
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }

    public static void main(String[] args) {
        String s = "siddhi";
        System.out.println(reverse(s));
    }
}
