package com.siddhi;
import java.util.*;
public class StringMethod {
    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println( s.length());
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(0));
        String input = " ";
        if(input.isBlank()){
            System.out.println("Input is empty");
        }
        char last =s.charAt(s.length() -1);
    }
}
