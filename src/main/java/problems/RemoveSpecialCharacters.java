package problems;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String inputString = "I$n$d$r#e@s^h%";
       // String result = inputString.replaceAll("[^a-zA-Z0-9]", "");
        String result = inputString.replaceAll("[^\\w]", "");
        System.out.println(result);
    }
}

