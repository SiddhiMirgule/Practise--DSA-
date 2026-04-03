//reverse string hello
//Two pointer approach
package com.siddhi;
import java.util.*;

public class ReverseStr{
    public static char [] reverseString(char[] str){
        int left = 0 ;
        int right = str.length - 1;
        while(left<right){
            char temp = str [left];
            str[left] =str[right];
            str[right] = temp ;

            left++;
            right--;
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        char[] str = s.toCharArray();

        System.out.println(reverseString(str));
    }
}