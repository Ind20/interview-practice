package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("abc");
        set.add("jkl");
        set.add("xyz");

        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
