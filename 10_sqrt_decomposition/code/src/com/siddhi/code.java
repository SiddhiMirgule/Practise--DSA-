package com.siddhi;
//square root decomposition code
import java.util.*;
public class code {
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        int arr [] ={4,3,1,8,4,5,6,1,8,2};
        int n = arr.length;

        int blockSize =(int)Math.sqrt(n);
        int []block = initialization(arr,n,blockSize);

        int l = 2;
        int r= 8;

        int result = querry(l,r,blockSize,arr,block);
        System.out.println("sum from "+l+" to "+r+" = "+result );
    }

    public static int[] initialization(int []arr,int n ,int blockSize){
      int numberofblocks = (n + blockSize -1)/blockSize;
      int[] block = new int[numberofblocks];

      for(int i = 0 ; i < n ;i++){
          block[i/blockSize] +=arr[i];
      }
      return block;
    }
    public static int querry(int l,int r, int blockSize,int [] arr,int[] block){
        int sum = 0;

        //left
        while(l <= r && l % blockSize != 0){
            sum += arr[l];
            l++;
        }
        //full
        while(l + blockSize - 1 <= r){
            sum += block[l / blockSize];
            l +=blockSize;
        }
        //right
        while(l <=r){
            sum+=arr[l];
            l++;
        }
        return sum;
    }

}
