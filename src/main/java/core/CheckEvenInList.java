package javapractice;

import java.util.Arrays;
import java.util.List;

public class CheckEvenInList {
    public static boolean hasEven(List<Integer> list){
        for(int i: list){
            if(i%2==0)
                return true;
        }
        return  false;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 7, 5, 9);
        System.out.println(hasEven(list)?"list has even number":"list has no even number");

    }
}
