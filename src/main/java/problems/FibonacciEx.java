package problems;

import java.math.BigInteger;

public class FibonacciEx {
    public static void main(String[] args) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        for (int i = 2; i < 1000; i++) {
            BigInteger next = a.add(b);
            System.out.println(next);
            a = b;
            b = next;
        }
    }
}
