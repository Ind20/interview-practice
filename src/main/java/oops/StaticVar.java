package oops;

public class StaticVar {
    public static void main(String[] args) {
        Parent1.x = 1;
        System.out.println(Parent1.x + Child1.x + Child2.x);

        Parent1.x = 2;
        System.out.println(Parent1.x + Child1.x + Child2.x);

        Parent1.x = 3;
        System.out.println(Parent1.x + Child1.x + Child2.x);

    }

}

class Parent1{
    static int x ;

}

class Child1 extends Parent1{

}

class Child2 extends Child1{

}