package problems;
import java.util.HashMap;
import java.util.Map;

public class HashMapStreamExample{
    static Map<Character, Integer> getMostRepeated(String str){
        String input = str.toLowerCase();
        System.out.println(input);
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        char ch = ' ' ;
        Map<Character, Integer> outputmap = new HashMap<>();
        for(char c:input.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c, 1);
            }else{
                map.put(c, map.get(c)+1);
                max = map.get(c)+1;
                ch = c;
            }
        }
        outputmap.put(ch, max);
        System.out.println(outputmap);
        return outputmap;

    }

    public static void main(String[] args){
        String str = "Automation Testing";
        Map<Character, Integer>map1 = getMostRepeated(str);
        char letter = ' ';
        int num = 0;
        for(char c : map1.keySet()){
            letter = c;
            num = map1.get(c);
        }

        System.out.println("Letter "+letter+" Repeated = "+num+" times");

    }
}
