package problems;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "programming";
        char[] arr = str.toCharArray();
        List<String> list = new ArrayList<>();
        for(char c:arr){
            if(!list.contains(String.valueOf(c))){
                list.add(String.valueOf(c));
            }
        }

        System.out.println("String after removing duplicates: " + String.join("", list));
    }
}
