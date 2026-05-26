package _00_MAIN_TOPICS;
//find sum of array
public class _02_findSum {
    public static void main(String[] args){
        int [] arr = {1,2,3,4};
        int n = 0 ;
        int x = 4;
        int [] Result = change(arr,n,x);
        int result = sum(arr);
        System.out.println(result);

        System.out.println();
    }
    public static int sum(int[] arr){
        int sum = arr[0] ;
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static int [] change(int [] arr, int n, int x){
        arr[n] = x;
        return arr;
    }
}
