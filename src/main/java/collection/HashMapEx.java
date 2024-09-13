package collection;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        for (String i : capitalCities.keySet()) {
            System.out.println(i + " - " + capitalCities.get(i));
        }
    }
}
