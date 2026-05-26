package _01_Arrays;
import java.util.Arrays;
public class _07_kth_Largest {

    public static void main(String[] args){
        int [] arr = {1,5,4,3,6,8};
        int k = 3;
        Arrays.sort(arr);
        System.out.print(k+"th element is : ");
        System.out.println(largest(arr,k));
    }
    public static int largest(int[] arr, int k) {

        Arrays.sort(arr);

        return arr[k - 1];
    }
}
