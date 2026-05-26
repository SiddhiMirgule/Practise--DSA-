package _01_Arrays;
import java.util.*;
public class _08_RangeSum {

    public static void main(String [] args){
        int[] arr = {2,4,1,5,3};
        int n = arr.length ;

        System.out.println(Arrays.toString(sum(arr,n)));
    }
    public static int [] sum(int [] num , int n){
        int [] prefix = new int[n];
        prefix[0] = num[0];
        for(int i = 1 ; i < n ; i++){
            prefix[i] = prefix[i-1] + num[i];
        }


        return prefix;
    }
}
