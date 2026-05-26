//running sum of array
import java.util.*;
public class prefixSum {
    public static void main(String [] args){
        int [] arr = {1,5,10,15,20};
        int n = arr.length;
        int querries = 2;
        int l = 1;
        int r = 3;
        // solution(arr);
        rangeSum(l,r,arr,querries);
    }

//    public static void  solution(int [] a){
//        int [] ans = new int[a.length + 1];
//         ans[0] = a[0];
//
//        for(int i =1 ; i < a.length; i++){
//            ans[i] = ans[i-1]+ a[i];
//        }
//        System.out.print("[");
//        for(int i = 0 ; i < a.length; i++){
//            System.out.print(" "+ans[i]+" ");
//        }
//        System.out.print("]");
//
//    }

    public static void  rangeSum(int l , int r , int[] a, int querries){
            int n = a.length;
            int [] prefix = new int[n];
            prefix[0] =a[0];
            for(int i = 1 ; i < n ; i++){
                prefix[i] = prefix[i-1]+a[i];
            }

                int sum;
                if(l ==0){
                    sum = prefix[r];
                }
                else{
                    sum = prefix[r] - prefix [l-1];
                }
                System.out.println(sum);
            


    }
}
