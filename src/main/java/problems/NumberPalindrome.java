package problems;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = in.nextInt();
        String str = String.valueOf(a);
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        if (rev.equals(str)) {
            System.out.println("number is a palindrome");
        } else {
            System.out.println("number is not a palindrome");
        }
    }
}
