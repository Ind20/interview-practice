public class ReverseSentense {
    public static void main(String[] args) {
        String input = "where was the man";
        StringBuilder reversed = new StringBuilder();
        String[] arr = input.split(" ");
        for(String word: arr){
            reversed.append(new StringBuilder(word).reverse().append(" "));
        }

        String output = reversed.toString().strip();
        System.out.println(output);

    }
}
