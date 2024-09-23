package problems;

import java.util.ArrayList;
import java.util.Collections;

public class Swap2 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        System.out.println("Before swapping a = " + a + ", b = " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Before swapping a = " + a + ", b = " + b);
    }
}