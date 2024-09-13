package core;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your obtained marks:");
        int oMarks = in.nextInt();

        if (40 < oMarks && oMarks < 60) {
            System.out.println("Passed Second Division");
        } else if (oMarks <= 60) {
            System.out.println("Passed First Division");
        } else {
            System.out.println("You are failed!");
        }
    }
}
