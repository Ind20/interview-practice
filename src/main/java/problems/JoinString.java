package problems;

public class JoinString {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence to join words.";

        String[] words = sentence.split(" ");
        String joinedSentence = String.join("", words);
        System.out.println("Joined Sentence: " + joinedSentence);
    }
}
