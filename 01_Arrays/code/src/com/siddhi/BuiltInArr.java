package com.siddhi;
import java.util.Arrays;
public class BuiltInArr {
    public static void main(String[]arg) {
        int[] nums = {5, 2, 8, 1, 9, 3};

        //Arrays built-in
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        //sort an array
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.print("[ ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            System.out.print(" ");
        }
        System.out.print("]");


//      copy an array
        int[] copy = Arrays.copyOf(nums, nums.length);

//      fill an array with 1 value
        int[] zeros = new int[5];
        Arrays.fill(zeros,7);
        System.out.println(Arrays.toString(zeros));

//      compare 2 arrays
        int []a ={1,2,3};
        int []b ={1,3,4};
        System.out.println(Arrays.equals(a,b));
//        System.out.println(a==b);
        for(int i =0 ; i <a.length;i++){
            for(int j =0 ; j <b.length ;j++){
                if(a[i]==b[j]){
                    System.out.print("comparing 2 array and printing equal elements "+a[i]+" ");
                }
            }
        }
    }
}
