package problems;

public class Palindrome {
    public static void main(String[] args) {
        String str = "TENET";
        String rev = "";
        for (int i =0; i < str.length(); i++) {
          rev = str.charAt(i) + rev;
        }
        if (rev.equals(str)) {
            System.out.println("string is a palindrome");
        } else
        {
            System.out.println("string is not a palindrome");
        }
    }
}
