package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueue {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("abcd");
        dq.add("abcd1");
        dq.add("abcd2");
        dq.add("abcd3");

        System.out.println(dq);


    }
}