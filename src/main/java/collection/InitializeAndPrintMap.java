package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InitializeAndPrintMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("RS", "Rohit Sharma");
        map.put("VK", "Virat Kohli");
        map.put("RJ", "Ravindra Jadeja");

        //for loop
        for (String i : map.keySet()) {
            System.out.println(i+ "->" +map.get(i));

        }

        System.out.println(map);

        //iterator
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Initials: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
