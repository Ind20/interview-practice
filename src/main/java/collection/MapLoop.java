package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapLoop {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        for(int i : map.keySet()){
            System.out.println(i+ " -> "+map.get(i));
        }

        Iterator<Integer> keyIterator = map.keySet().iterator();
        while (keyIterator.hasNext()) {
            Integer key = keyIterator.next();
            System.out.println(key+ " -> " +map.get(key));
        }
    }
}
