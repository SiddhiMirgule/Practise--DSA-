package com.siddhi;

public class StringBuild {
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb.append(" World!"));
        System.out.println(sb.insert(5,","));
        System.out.println(sb.replace(7,12,"Java"));
        System.out.println(sb.delete(5,6));
        System.out.println(sb.reverse());
        System.out.println(sb.length());

    }
}
