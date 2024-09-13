package core;

import java.util.ArrayList;
import java.util.List;

// generic class
public class Generics <T> {
    T thingsToPrint;

    public Generics(T thingsToPrint){
        this.thingsToPrint = thingsToPrint;
    }

    public  void print(){
        System.out.println(thingsToPrint);

    }

// generic method
    public <Z, X> void print(Z a, X b){
        System.out.println(a + " : " + b);

    }
//wild card method
    public void printList(List<?> list) {
            System.out.println(list);
        }

}

class  Implement {
    public static void main(String[] args) {
        Generics<String> obj = new Generics<>("Indresh Maurya");
        obj.print("My", "test");
        obj.print();
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(555);
        obj.printList(list);

    }
}