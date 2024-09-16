package javapractice;
public class CheckVovel {
        public static void main(String[] args) {
            String testString = "bcd";
            boolean hasVowels = testString.matches(".*[aeiouAEIOU].*");
            System.out.println(hasVowels ? "The string contains vowels." : "The string does not contain vowels.");
        }
    }
