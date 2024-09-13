package problems;

import java.util.*;

public class ReverseList {
    public static void reveseList(List list){
        List<Integer> list2 = new ArrayList<>();
        for(int i=list.size()-1; i>=0;i--){
            list2.add((Integer) list.get(i));
        }
        System.out.println(list2);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        reveseList(list);
    }
}
