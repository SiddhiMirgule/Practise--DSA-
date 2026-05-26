package _01_Arrays;
//https://leetcode.com/problems/contains-duplicate/description/
//217. Contains Duplicate
import java.util.Arrays;
public class _04_Duplicate {
    public static void main(String[] args){
        int [] nums ={1,2,3,6};
        System.out.println(duplicate(nums));
    }
    public static boolean duplicate(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1]){
                return true ;
            }
        }
        return false;
    }
}
