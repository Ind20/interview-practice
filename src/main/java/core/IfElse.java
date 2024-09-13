package core;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int pMarks = 40;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your obtained marks:");
        int oMarks = in.nextInt();

        if (oMarks >= pMarks) {
            System.out.println("You are passed!");
        } else {
            System.out.println("You are failed!");
        }
    }
}
