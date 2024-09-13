package core;
import java.util.regex.*;

public class RegEx {

        public static void main(String[] args) {
            String name = "Amit1234";
            System.out.println(Pattern.matches("[a-zA-Z0-9]{8,20}", name));
        }
    }
