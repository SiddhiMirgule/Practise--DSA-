//array list example
package com.siddhi;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> li = new ArrayList<>(5);

        for(int i = 0 ; i < 5 ; i++){
            li.add(sc.nextInt());
        }
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(li.get(i));
        }
    }
}
