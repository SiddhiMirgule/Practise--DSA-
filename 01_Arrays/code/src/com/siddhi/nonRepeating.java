
// non repeating element in array
//Input: {-1, 2, -1, 3, 0}
//Output: 2
//Explanation: The first number that does not repeat is : 2
package com.siddhi;
import java.util.*;
public class nonRepeating {
    public static int nonRepeatedNum(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
          boolean isRepeated = false;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeated = true;
                }
            }

            // if no duplicate found
            if (!isRepeated) {
                return arr[i];
            }
        }

        return -1; // if all elements repeat
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(nonRepeatedNum(arr));
    }
}