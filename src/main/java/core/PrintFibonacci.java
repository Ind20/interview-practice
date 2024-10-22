package core;

public class PrintFibonacci {
    public static void printFibonacci(int number){
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i=0; i<=number;i++){
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
        }
    }

    public static void main(String[] args) {
        printFibonacci(5);
    }
}
