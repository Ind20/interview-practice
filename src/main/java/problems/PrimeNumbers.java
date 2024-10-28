package problems;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many prime numbers you want: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("invalid number!");
        } else if (n == 1) {
            System.out.println(2);
        } else {
            System.out.println("First " + n + " prime numbers are :");
            int count = 0;
            int number = 2; // Starting from the first prime number

            while (count < n) {
                if (isPrime(number)) {
                    System.out.print(number + " ");
                    count++;
                }
                number++;
            }

        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

