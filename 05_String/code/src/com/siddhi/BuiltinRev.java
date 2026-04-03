//Reverse a string using Built-in reverse function
package com.siddhi;
import java.util.*;
public class BuiltinRev {
    public static String reverse(String str){
        String s = new StringBuilder(str).reverse().toString();
        return s;
    }
    public static void main(String[] args) {
        String s = "siddhi";
        System.out.println(reverse(s));

    }
}
