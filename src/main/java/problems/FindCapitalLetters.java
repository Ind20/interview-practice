package collection;

import java.util.ArrayList;
import java.util.List;

public class FindCapitalLetters {
    public static void main(String[] args) {
        String str = "AbcFkdGsdTdfdR";
        char[] arr = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for(char c : arr){
            if(c<96){
                list.add(c);
            }
        }
        System.out.println(list);
    }
}