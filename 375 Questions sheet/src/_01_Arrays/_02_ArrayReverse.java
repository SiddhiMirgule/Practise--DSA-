package _01_Arrays;
//https://www.geeksforgeeks.org/dsa/program-to-reverse-an-array/
//Array Reverse
import java.util.*;
public class _02_ArrayReverse {

    public static void main(String [] args){
        int [] arr={2,5,6,7,8,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int [] num){
        int n = num.length - 1;
        int start = 0;
        int end = n ;
        while(start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] =temp;

            start++;
            end--;
        }
    }
}

