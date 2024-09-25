package problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateInString {
    public static void main(String[] args) {
        String name = "indreshmaurya";
        char[] arr = name.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : arr){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else {
                map.put(c, 1);
            }
        }

        System.out.println(map);

        for(char c : map.keySet()){
            if(map.get(c)>1){
                System.out.print(c+" ");
            }
        }


    }
}
