package core;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap a = "+a+" b = "+b);

    }
}
