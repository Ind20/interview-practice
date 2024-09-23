package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMatchingUnmatching {
    public static void main(String[] args) {

        int[] array1={8,3,0,4,2,6};
        int[] array2={7,6,3,8,5,1,4,0,9};

        List<Integer> matched = new ArrayList<>();
        Set<Integer> unmatched = new HashSet<>();

        for (int k : array1) {
            for (int i : array2) {
                if (k == i) {
                    matched.add(k);
                } else {
                    unmatched.add(k);
                    unmatched.add(i);
                }
            }
        }
        unmatched.removeAll(matched);

        System.out.println("matching elements :"+matched);
        System.out.println("unmatching elements :"+unmatched);

    }
}
