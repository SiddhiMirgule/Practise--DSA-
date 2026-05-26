package _01_Arrays;
import java.util.Arrays;
public class _09_RangeSum {
    public static int  sum(int[] num,int L , int R){
        int[] prefix = new int [num.length];
        //prefix[0] = num[L];
        int sum = 0 ;
        for(int i = L ; i<= R ; i++){
            prefix[i] = prefix [i-1] + num[i];
            sum = prefix[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int [] arr = {2,4,1,5,3};
        int L = 1;
        int R = 3;
       // System.out.println(Arrays.toString(sum(arr,L,R)));
        System.out.println(sum(arr,L,R));
    }
}
