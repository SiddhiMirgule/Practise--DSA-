// 3 by 3 matrix and 2 by 2 matrix
package com.siddhi;
import java.util.*;
public class Multidimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[2][2];
        //int [][] arr = new int[3][3];
        System.out.println(arr.length);

        for(int i = 0 ; i <arr.length;i++){
            for(int j = 0 ; j < arr[i].length;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i = 0 ; i <arr.length;i++){
            for(int j = 0 ; j < arr[i].length;j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
