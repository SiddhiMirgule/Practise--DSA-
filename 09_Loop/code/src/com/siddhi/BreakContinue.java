package com.siddhi;

public class BreakContinue {
    public static void main(String[] args) {
        for(int i = 0 ; i <5 ; i++){
            if(i == 3) break;
            System.out.print(i);
        }
        System.out.println(" ");
        for(int i = 0 ; i< 6; i++){
            if(i == 3) continue;
            System.out.print(i);
        }

//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                System.out.print(i + "-" + j + "  ");
//            }
//            System.out.println();
//        }
    }
}
