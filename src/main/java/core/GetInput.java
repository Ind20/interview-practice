package core;

import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        int a;
        float b;
        String s;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        a = in.nextInt();
        b = in.nextFloat();
        System.out.println("String: " + s + ", Integer: " + a + ", Float: " + b);
    }
}
