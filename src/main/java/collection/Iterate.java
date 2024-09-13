package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iterate {
    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());

        // print all items
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        Map<String, String> cars1 = new HashMap<>();
        cars1.put("BMW", "X6");
        cars1.put("Audi", "Q7");
        cars1.put("WB", "Polo");

        Iterator<Map.Entry<String, String>> iterator = cars1.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println("Key: " + key + ", Value: " + value);
        }

        //OR

        for (Map.Entry<String, String> entry : cars1.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println("Key: " + key + ", Value: " + value);
        }


    }
}
