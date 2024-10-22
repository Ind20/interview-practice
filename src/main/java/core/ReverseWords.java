package core;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "My name is indresh maurya";
        // output = yM eman si sherdni ayryam
        String reverced = "";
        String[] words = str.split(" ");

        for(String w : words){
            String rev = "";
            for(int i =0;i<w.length();i++){
                rev = w.charAt(i)+rev;
            }
            reverced = reverced.concat(rev).concat(" ");
        }
        System.out.println(reverced.strip());
    }
}
