package dsa;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void bubbleSort(int n){
        Random rand = new Random();
        int[] numbers = new int[n];
        for(int i = 0; i<numbers.length-1;i++){
            numbers[i] = rand.nextInt(100000);
        }
        System.out.println("Before :" + Arrays.toString(numbers));
        boolean somethingToSwap = true;
        while (somethingToSwap) {
            somethingToSwap = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    somethingToSwap = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        System.out.println("After :" + Arrays.toString(numbers));

    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        bubbleSort(100000);
        long endTime = System.currentTimeMillis();
        System.out.println("Took " + (endTime - startTime) +" milliseconds");
    }
}
