package problems;

public class RevString {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "";

        for (int i = 0; i < str1.length(); i++) {
            str2 = str1.charAt(i)+str2;
        }

        System.out.println("Reversed string: "+ str2);
    }

}