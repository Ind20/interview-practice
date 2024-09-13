package collection;

import java.util.EnumMap;

public class EnumMapEx {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    public static void main(String[] args) {

        // Creating an EnumMap of the Size enum
        EnumMap<Size, Integer> sizes1 = new EnumMap<>(Size.class);

        // Using the put() Method
        sizes1.put(Size.SMALL, 28);
        sizes1.put(Size.MEDIUM, 32);
        System.out.println("EnumMap1: " + sizes1);

        EnumMap<Size, Integer> sizes2 = new EnumMap<>(Size.class);

        // Using the putAll() Method
        sizes2.putAll(sizes1);
        sizes2.put(Size.LARGE, 36);
        System.out.println("EnumMap2: " + sizes2);

        EnumMap<Size, Integer> sizes3 = new EnumMap<>(Size.class);

        // Using the putAll() Method
        sizes3.putAll(sizes2);
        sizes3.put(Size.EXTRALARGE, 46);
        System.out.println("EnumMap3: " + sizes3);
    }
}
