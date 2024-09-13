package problems;


import java.util.Arrays;

class ArrMinMax {
    public static void main(String[] args) {
        int[] arr = {10, 5, 30, 20, 50};
        Arrays.sort(arr);
//        int max = arr[0];
//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++)
//        {
//            if (min > arr[i]){
//                min = arr[i];
//            }
//            if (max < arr[i]){
//                max = arr[i];
//            }
//        }
//        System.out.println("min is :" +min+ "\nand max is: " +max);
        System.out.println("max is :" +arr[arr.length-1]+ "\nand min is: " +arr[0]);

    }
}