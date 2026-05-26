package com.siddhi;
import java.util.*;
public class MaxNumberAfterRemove {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int n =in.nextInt();
        int c = in.nextInt();
        int[][] a =new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=in.nextInt();
            a[i][1]=in.nextInt();
        }
        Arrays.sort(a,new Comparator<int[]>(){
            public int compare(int[]x,int[]y){ return x[0]-y[0];}
        });
        PriorityQueue<Integer>p = new PriorityQueue<>();
        int i =0, ans =0,curr=c;
        while(true){
            while(i<n && a[i][0]>=curr){
                p.add(a[i][1]);
                i++;
            }
            if(p.isEmpty())
                break;

            int value=p.poll();
            if(value>curr){
                curr=value;
            }
            ans++;
        }
        System.out.println(ans);
    }
}