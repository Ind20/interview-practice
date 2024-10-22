package core;

public class CheckPalindromeString {
    public static boolean ispalindrome(String str){
        for(int i=0; i<=str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-i-1))

                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(ispalindrome("tenet")?"string is a palindrome":"string is not a palindrome");
    }
}
