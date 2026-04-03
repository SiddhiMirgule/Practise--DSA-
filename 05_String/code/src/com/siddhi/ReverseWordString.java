package com.siddhi;
//reverse word in a string
//Reverse words in a sentence
//👉 "I love Java" → "Java love I"
import java.util.*;
public class ReverseWordString {
    public static String rev(String str){
        str =str.trim();
        String[] words =str.split("\\s");
        StringBuilder result = new StringBuilder();
        for(int i = words.length-1 ; i>=0 ;i--){
            result.append(words[i]);

            if( i != 0){
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "siddhi is a girl";
        System.out.println(rev(str));
    }
}
