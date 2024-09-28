package problems;

import java.util.*;

public class JavaArrayList {
    public static void main(String[] args) {
        //List is a resizable array
        List<String> list = new ArrayList<>();
        list.add("john");
        list.add("johny");
        list.add("janardan");
        System.out.println(list);

        //iterate through list
        Iterator<String> it = list.iterator();

        //print first element of list
        System.out.println(it.next());
        //print remaining the elements
        do {
            System.out.println(it.next());
        } while (it.hasNext());

        // print using for loop
        for(String s:list){
            System.out.println(s);
        }

        //size of the list
        System.out.println(list.size());

        //add in beginning
        list.add(0,"hey");

        //print as string
        System.out.println(list);

        //clear the list
        list.clear();
        System.out.println("list is empty : "+ list.isEmpty());



    }
}