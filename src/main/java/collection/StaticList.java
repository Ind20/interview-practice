package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        list.add(9);
        System.out.println(list);
    }
}
