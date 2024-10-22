package problems;

class Parent {
    public static void staticMethod() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    public static void staticMethod() {
        System.out.println("Static method in Child class");
    }
}

public class TestMono {
    public static void main(String[] args) {
        Parent p = new Child();
        p.staticMethod(); // This will call Parent's static method
    }
}

