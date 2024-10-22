package problems;

import static java.lang.System.exit;

public class Factorial {
    public static int factorial(int n){
        int fact;
        if(n<0) {
            System.out.println("Please enter a valid number");
            System.exit(0);
            System.out.println();
        }
        if (n == 1 | n == 0) {
            fact = 1;
        }else {
            fact = n * (factorial(n - 1));
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial(-9));

    }
}
