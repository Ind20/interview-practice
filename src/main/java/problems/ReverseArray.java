package problems;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int length = arr1.length;
        int[] arr2 = new int[length];

        for (int i = 0; i <= arr1.length-1; i++) {
            arr2[i]= arr1[length-1-i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}