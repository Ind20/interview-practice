package core;

public class NullPtrExp {
    public static void printStrLength() {
        try {
            String text = null;
            int length = text.length();
            System.out.println("Length of text: " + length);
        } catch (Exception e) {
            System.out.println("exception found");

        }
    }

    public static void main(String[] args) {
        String name = "john";
        printStrLength();
        System.out.println(name);
    }
}
