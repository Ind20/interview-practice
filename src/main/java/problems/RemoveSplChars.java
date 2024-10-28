package problems;

public class RemoveSplChars {
    public static void removeSpacialChar(String str){
        String output = str.replaceAll("[^\\w]", "");
        System.out.println(output);
    }
    public static void main(String[] args) {
        removeSpacialChar("my&%$%$name*(*(is*^*(^khan");

    }
}
