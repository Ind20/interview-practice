package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

    public static void main(String[] args) {

        // No order
        // duplicate not allowed

        Set<String> names = new TreeSet<>();
        names.add("James");
        names.add("walter");
        names.add("jimmy");
        names.add("walter");

        //System.out.println(names);

        //names.remove("walter");

        //System.out.println(names);
        //System.out.println(names.size());
       // System.out.println(names.contains("jimmy"));
        //names.forEach(System.out::println);

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
