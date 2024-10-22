package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LamdaExp {
    public interface Test{
        List<Integer> uniqueList();
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,4,6,8,3,56,4,4);
        Test exp = () -> {
            List<Integer> list2 = new ArrayList<>();
            for(int i : list){
                if(!list2.contains(i)){
                    list2.add(i);
                }
            }
            return list2;
        };

        System.out.println(exp.uniqueList());
    }
}
