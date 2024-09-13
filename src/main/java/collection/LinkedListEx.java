package collection;

import java.util.LinkedList;

public class LinkedListEx {
        public static void main(String[] args) {
            LinkedList<String> cars = new LinkedList<>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            System.out.println(cars);
            System.out.println(cars.getFirst());
        }
    }
