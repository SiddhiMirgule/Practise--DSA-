//    *
//    **
//    ***
//    ****
//    *****
package com.siddhi;

import javax.swing.*;

public class pattern3 {
    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
