package collection;

import java.util.*;
import java.util.stream.Collectors;

import static org.apache.commons.collections4.CollectionUtils.collect;

public class ArrList {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        //Collections.sort(cars);
        //List<String> cars1 =  cars.stream().sorted().collect(Collectors.toList());
        cars.sort((a,b) -> b.compareTo(a));
        cars.sort(Comparator.naturalOrder());
        System.out.println(cars);

        List<Integer> numbers = Arrays.asList(1, 5, 6, 8, 4, 6, 4);
        numbers.sort((a,b) -> a - b);
        System.out.println(numbers);

    }
}