package com.siddhi;
//swap the first and last character in a String
public class SwapChar {

    public static String swap(String s){
        if (s == null || s.length() < 2) {
            return s;
        }

        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);

        String middle = s.substring(1, s.length() - 1);

        return last + middle + first;
    }

    public static void main(String[] args) {
        String str = "A";
        String str1 ="siddhi";
        String str2 ="television";
        System.out.println(swap(str2));
    }
}
