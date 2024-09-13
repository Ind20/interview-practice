package oops;


public interface Parent {
    public default void method(){
        System.out.println("im parent method");
    }
    public default void method2(){
        System.out.println("im child method2");
    }
    public void myMethod();
}