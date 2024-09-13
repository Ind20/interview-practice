package problems;

public class MaxArr {

    public static void main (String[] args){

        int[] arr ={44,66,99,77,33,22,55};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The maximum value in the array is: " + max);
    }
}
