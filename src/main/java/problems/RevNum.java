package problems;

import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        int num, rev = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number to be reversed");
        num = in.nextInt();
        while (num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num/10;
        }
        System.out.println("reversed no. is " + rev);
    }
}
