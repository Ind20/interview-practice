package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "programming";
        String output = "";
        Set<Character> set = new HashSet<>();
        for(char c:str.toCharArray()){
            if(set.add(c)){
                output += c;
            }
        }
        System.out.println(output);
    }
}
