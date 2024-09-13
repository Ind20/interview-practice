package oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ComparableExample {

    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Emp1", 1234567890, 3));
        emp.add(new Employee("Emp3", 1234535234, 1));
        emp.add(new Employee("Emp2", 1236786576, 2));

        System.out.println(emp); // without sorting

        Collections.sort(emp); // sort by comparable
        System.out.println(emp);

        List<Employee> emp1 = new ArrayList<>(emp);
        emp1.sort(new IdComparator()); // sort by comparable
        System.out.println(emp);

    }

}

