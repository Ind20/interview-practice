package core;

interface Printable{
    void print(String str);
}
public class LambdaExample {
    public static void main(String[] args) {
        Printable lambda = str -> System.out.println(str);
        lambda.print("My name is indresh");


    }


}
