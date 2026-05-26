package _01_Arrays;
//https://www.geeksforgeeks.org/dsa/chocolate-distribution-problem/
//Chocolate Distribution Problem
import java.util.Arrays;
public class _05_chocolateDistribution {

    public static void main(String [] args){
        int [] arr = {7, 3, 2, 4, 9, 12, 56};
        int students = 3;
        System.out.println( distribution(arr,students));
    }

    public static int distribution(int[] num , int m){
        int maxDiff = Integer.MAX_VALUE ;
        Arrays.sort(num);
        int n = num.length;
        //Sliding window
        for(int i = 0 ; i <= n-m ; i++) {
           int currentDiff = num[i + m - 1] - num[i];

            if (currentDiff < maxDiff) {
                maxDiff = currentDiff;
            }
        }
        return maxDiff;
    }
}