package problems;

public class RemoveSplChars {
    public static void removeSpace(String str){
        String regex = "[^\\w\\s]";
        String output = str.replaceAll(regex, "");
        System.out.println(output);
    }
    public static void main(String[] args) {
        removeSpace("my&%$%$name*(*(is*^*(^khan");

    }
}
