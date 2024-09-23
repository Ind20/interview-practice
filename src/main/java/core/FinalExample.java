package core;

public class FinalExample {
    public static void main(String[] args) {

        System.out.println(myMethod());
    }

    private static int myMethod() {
        try{
            throw new RuntimeException();

        }catch(Exception e) {

            System.out.println("Exception caught");

            return 2;

        }finally {

            System.out.println("final block is executed");

        }
    }
}
