package _01_Arrays;
//https://leetcode.com/problems/maximum-subarray/description/
//53. Maximum Subarray
import java.util.Arrays;
public class _03_MaxSubArray {

    public static void main(String [] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(subArray(arr));
    }

    public static int subArray(int[] num){
        //Kadane Algorithm
        //O(n)
        int maxSum = num[0];
        int currentSum = 0 ;

        for(int x : num){
            currentSum += x;

            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0 ){
                currentSum = 0 ;
            }
        }
        return maxSum;
    }
}
