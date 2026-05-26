//som of array
public class sumofArray {
    public static void main(String[] args){
        int [] arr = {1,2,3,4};
        int result = solution(arr);
        System.out.println(result);
    }
    public static int solution(int[] A){
        int sum = 0 ;
     for(int i = 0 ; i < A.length ; i++){
         sum += A[i];
     }
     return sum;
    }
}
