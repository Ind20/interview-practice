package core;

public class Polymorphism extends Parent {
    int b = 20;
    @Override
    public void print(String text1) {
        super.print("I am a super method");
        System.out.println("I " + text1+" : "+(a+b));
    }

    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        obj.print("am overridden method");
        obj.print("See", " also I am overloaded method");
    }
}
