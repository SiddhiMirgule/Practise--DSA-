package com.siddhi;
import java.util.Scanner;
public class ArrayMethod{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0 ; i <arr.length ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sum of all elements in array is :"+SumArr(arr));
        System.out.println("Maximum element in array : "+Max(arr));
        System.out.println("Minimum element in array : "+Min(arr));
        printArr(arr);


    }
//    find sum of array
    public static int SumArr(int []num){
        int total = 0;
        for(int nums:num){
            total = total + nums;
        }
        return total;
    }

//      method to find maximum
    public static int Max(int [] num){
        int maximum = num[0];
        for(int i = 1 ; i < num.length ;i++){
            if(num[i] > maximum){
                maximum = num[i];
            }
        }
        return maximum;
    }

//    method to find minimum
    public static int Min(int [] num){
        int minimum = num[0];
        for(int arr : num){
            if(arr < minimum){
                minimum = arr;
            }
        }
        return minimum;
    }

    // method to print array nicely
    public static void printArr(int[] arr){
        System.out.print("[");
        for(int i = 0 ; i <arr.length; i++){
            System.out.print(arr[i]);
            if( i < arr.length-1) System.out.print(" , ");
        }
        System.out.println("]");
    }
}