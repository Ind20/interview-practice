package problems;

public class IgnoreArrElement {

    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,5,6,7,8,9};

        for (int i : arr ) {
            if (i == 4) {
                continue;
            }
            System.out.println(arr[i]);
        }
    }

}
