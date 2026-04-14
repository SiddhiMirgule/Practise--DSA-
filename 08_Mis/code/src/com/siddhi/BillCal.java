package com.siddhi;
import java.util.Scanner;
//simple bill calculator
//totalBeforeGST = price * quantity;
// gstAmount = totalBeforeGST * gst;
//finalBill = totalBeforeGST + gstAmount;
public class BillCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("print the price : ");
        double price = sc.nextDouble();
        System.out.println("quantity : ");
        int quantity = sc.nextInt();
        double  gst = 0.18 ;
        String item = "Laptop";

        double totalBeforeGST = price * quantity ;
        double gstAmount = totalBeforeGST * gst ;
        double finalBill = totalBeforeGST + gstAmount;

        System.out.println("Item: "+item);
        System.out.println("price: "+price);
        System.out.println("GST (18%): "+gstAmount);
        System.out.println("Total Bill : "+finalBill);
    }
}
