package dsa;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void selectionSort(int n){
        Random rand = new Random();
        int[] numbers = new int[n];
        for(int i = 0; i<numbers.length-1;i++){
            numbers[i] = rand.nextInt(100000);
        }
        System.out.println("Before :" + Arrays.toString(numbers));


        for (int i = 0; i < numbers.length - 1; i++) {
            int min = numbers[i];
            int indexMin = i;
            for (int j = i+1; j< numbers.length;j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexMin = j;
                }
            }
                int temp = numbers[i];
                numbers[i] = numbers[indexMin];
                numbers[indexMin] = temp;
        }
        System.out.println("After :" + Arrays.toString(numbers));

    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        selectionSort(100000);
        long endTime = System.currentTimeMillis();
        System.out.println("Took " + (endTime - startTime) +" milliseconds");
    }
}
