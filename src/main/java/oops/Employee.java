package oops;

class Employee implements Comparable<Employee>{

    private String name;
    private long phone;
    private int id;

    public Employee(String name, long phone, int id) {
        this.name = name;
        this.phone = phone;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "Employee {"+"name'"+name+'\''+",phone='"+phone+'\''+", id="+id+'}';
    }
}