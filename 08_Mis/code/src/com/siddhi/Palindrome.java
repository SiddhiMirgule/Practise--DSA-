//check if the given string is palindrome or not
package com.siddhi;
import java.util.*;
public class Palindrome {

    public static boolean isPalindrome(String str){
        int left = 0 ;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right --;
        }
        return true;
    }

    public static ReverseStr method2(String str){
        String rev = new StringBuilder(str).reverse().toString();

        if(str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("not Palindrome");
        return null;
    }

    public static boolean method3(String str){
        str = str.toLowerCase().replaceAll("\\s+","");

        int left = 0 , right = str.length() -1 ;

        while(left < right){
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(isPalindrome(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
