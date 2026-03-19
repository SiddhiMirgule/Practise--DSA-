//reverse string hello
package com.siddhi;
import java.util.*;
public class ReverseStr {
    public static void isReverse(String str){
        char[] arr = str.toCharArray();
        int left= 0 , right =arr.length -1;

        while(left <right){
            char temp = arr[left];
            arr[left] =arr[right];
            arr[right]= temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args) {

    }
}
