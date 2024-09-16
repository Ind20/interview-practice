package javapractice;


public class ThreadLocalExample {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            //copyPaste();
        });

        Thread thread2 = new Thread(() -> {
            //copyPaste();
        });
        Thread thread3 = new Thread(() -> {
            //copyPaste();
        });
        Thread thread4 = new Thread(() -> {
            //copyPaste();
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}