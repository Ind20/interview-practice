package problems;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        a = in.nextInt();
        System.out.println("The Multiplication Table");
        for(int i = 1; i  <= 10; i++)
        {
            System.out.println(a+ "*" +i+" = " +(a*i));
        }
    }
}