package problems;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAndSortArray {
    public static void main(String[] args) {


        int[] a ={10,20,21,20,22,50,101,999,1,99,21,10,97,11,1001,111};

        ArrayList<Integer> list = new ArrayList<>();

        for (int j : a) {
            if (!list.contains(j)) {
                list.add(j);
            }
        }

        Collections.sort(list);

        System.out.println(list);

    }

}
