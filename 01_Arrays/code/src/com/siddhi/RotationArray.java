//Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
//Output: {3, 4, 5, 6, 1, 2}
//Explanation: After first left rotation, arr[]
// becomes {2, 3, 4, 5, 6, 1} and after the second rotation,
// arr[] becomes {3, 4, 5, 6, 1, 2}
package com.siddhi;
import java.util.*;
public class RotationArray {
    public static void rotation(int[] arr, int d) {
        int n = arr.length;

        for (int i = 0; i < d; i++) {

            // store first element
            int first = arr[0];

            // shift all elements left
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }

            // put first element at end
            arr[n - 1] = first;
        }
    }



    public static void main(String[] args) {
        int num[] ={1, 2, 3, 4, 5, 6};
        int d =2;
        rotation(num, d);

        System.out.println(Arrays.toString(num));
    }
}
