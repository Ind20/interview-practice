package problems;

public class Factorial {
    public static int factorial(int n){
        int fact;
        if (n == 1)
            fact = 1;
        else
            fact = n * (factorial(n-1));
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));

    }
}
