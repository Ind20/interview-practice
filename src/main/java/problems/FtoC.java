package problems;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        float temp;
        Scanner in = new Scanner(System.in);
        System.out.println("enter temp in fahrenheit:");
        temp = in.nextFloat();
        temp = ((temp - 32) * 5) / 9;
        System.out.println("temp in celsius is: " + temp);
    }
}
