package oops;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaFn {
    public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9, 2);

    // Sort the list using lambda and Stream API
    List<Integer> sortedNumbers = numbers.stream()
            .sorted(Integer::compareTo)
            .collect(Collectors.toList());

        System.out.println("Sorted List: " + sortedNumbers);


        }
}
