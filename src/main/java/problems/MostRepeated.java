package problems;
import java.util.HashMap;
import java.util.Map;

public class MostRepeated{
    public static Map<String, Object> getMostRepeated(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        char mostRepeatedChar = '\0';
        int maxCount = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                int count = frequencyMap.getOrDefault(ch, 0) + 1;
                frequencyMap.put(ch, count);
                if (count > maxCount) {
                    maxCount = count;
                    mostRepeatedChar = ch;
                }
            }
        }
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("mostRepeatedChar", mostRepeatedChar);
        resultMap.put("frequency", maxCount);
        return resultMap;
    }

    public static void main(String[] args){
        String str = "Automation Testing";
        Map<String, Object> result = getMostRepeated(str);
        System.out.println("Most repeated character - " + result.get("mostRepeatedChar") + ", Frequency - " + result.get("frequency"));

    }
}
