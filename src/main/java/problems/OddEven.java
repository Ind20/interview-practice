package problems;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = in.nextInt();
        if (x%2==0)
        {
            System.out.println("number is even");
        }else {
            System.out.println("number is odd");
        }
    }
}
