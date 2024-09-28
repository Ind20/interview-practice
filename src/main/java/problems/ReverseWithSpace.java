package problems;

public class ReverseWithSpace {
        public static void main(String[] args) {
            String input = "My name is indresh maurya";
            char[] arr = input.toCharArray();
            String output = "";
            String rev = "";
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] != ' ') {
                    rev = rev + arr[i];
                }
            }

            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == ' ') {
                    output = output + ' ';
                } else {
                    output = output + rev.charAt(j);
                    j++;
                }
            }

            System.out.println(output);
        }
    }


