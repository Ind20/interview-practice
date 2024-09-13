package collection;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        animals.add(2, "cow");

        System.out.println("Stack: " + animals);
    }
}