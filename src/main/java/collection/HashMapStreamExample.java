package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapStreamExample {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Orange", 2);
        map.put("Pineapple", 10);

        Map<String, Integer> filteredMap = map.entrySet()
                .stream().filter(entry -> entry.getValue()>3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(filteredMap);

        filteredMap.keySet().stream().forEach(key -> System.out.println(key));

        filteredMap.values().stream().forEach(value-> System.out.println(value));
    }
}
