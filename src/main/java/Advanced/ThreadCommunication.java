package Advanced;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadCommunication {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        Thread producer = new Thread(() -> {
            try {
                queue.put("Hello from Producer");
                System.out.println("Producer: Data sent.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });


        Thread consumer = new Thread(() -> {
            try {
                String data = queue.take();
                System.out.println("Consumer: Data received - " + data);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}

