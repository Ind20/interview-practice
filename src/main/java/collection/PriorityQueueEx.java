package collection;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("abcd");
        pq.add("abcd1");
        pq.add("abcd2");
        pq.add("abcd3");

        System.out.println(pq);


    }
}
