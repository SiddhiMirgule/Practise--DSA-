package String;

public class _01_Palindrome {
    public static void main(String[] args){
        String str = "A man, a plan , a canal: Panama";

    }
    public boolean isPalindrome(String str){
        str = str.replaceAll("[^a-zA-Z0-9]" ,"").toLowerCase();

        String reverse= new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }
}
