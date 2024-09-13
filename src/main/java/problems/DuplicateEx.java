package problems;

import java.util.HashSet;
import java.util.Set;

public class DuplicateEx {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 5, 6, 1 };
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();
        for (int num : arr) {
            if (!uniqueElements.add(num)) {
                duplicateElements.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicateElements);
    }
}
