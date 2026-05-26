package _01_Arrays;
//https://www.geeksforgeeks.org/dsa/maximum-and-minimum-in-an-array/
//Maximum and minimum of an array using minimum number of comparisons

import java.util.*;
public class _01_MaxMin {
    public static void Min(int [] num){
        int min = num[0];
        for(int i= 0 ; i < num.length;i++){
           if(num[i] < min){
               min = num[i];
           }
        }
        System.out.println("Minimum number in array is : "+min);
    }
    public static void Max(int[] num){
    int max = num[0];
    for(int i = 0 ; i < num.length ;i++){
        if( num[i] > max){
            max = num[i];
        }
    }
        System.out.println("Maximum number in array is : "+max);
    }
    public static void main(String[] args) {
        int [] arr1= {3,5,4,1,9};
        int [] arr = {22,14,8,17,35,3};
        Min(arr);
        Max(arr);

    }
}
