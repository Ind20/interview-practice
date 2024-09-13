package problems;

import java.util.*;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 5, 6, 3};
        findDuplicates(nums);
    }

    public static void findDuplicates(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.print("Duplicate elements: ");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

}
