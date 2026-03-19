package com.siddhi;

public class RemoveDuplicate {

    public static String removeDuplicate(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean found = false;

            // check if already in result
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "siddhi";
        System.out.println(removeDuplicate(str));
    }
}