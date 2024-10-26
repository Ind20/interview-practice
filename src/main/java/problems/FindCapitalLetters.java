package problems;

import java.util.ArrayList;
import java.util.List;

public class FindCapitalLetters {
    public static void main(String[] args) {
        String str = "AbcFkdGsdTdfdR";
        String output = "";
        char[] arr = str.toCharArray();
        for(char c : arr){
            if(c<96){
                output+= c;
            }
        }
        System.out.println(output);
    }
}