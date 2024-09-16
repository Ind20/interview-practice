package javapractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CompareArrayElements {
    int[] arr1 = {1, 2, 3, 4, 5, 5};
    int[] arr2 = {1, 2, 3, 4, 5};
    public boolean isElementEqual() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : arr1)
            set2.add(i);
        for (int i : arr2)
            set1.add(i);
        return set1.equals(set2);
    }

    public boolean isArrayEqual() {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        CompareArrayElements obj = new CompareArrayElements();
        System.out.println(obj.isElementEqual());
        System.out.println(obj.isArrayEqual());
    }
}
