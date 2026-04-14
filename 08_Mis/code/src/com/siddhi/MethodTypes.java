package com.siddhi;
import java.util.*;
public class MethodTypes {

    public static void greet(String name){
        System.out.println("Hello!"+name);
    }
    public static void calculate(double price , double rate){
        System.out.println((price*rate)/100);
    }

    public static void main(String[] args) {
        greet("parth");
        calculate(208.2,18.4);

    }
}
