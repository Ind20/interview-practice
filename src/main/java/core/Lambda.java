package core;

interface Print{
    public void print(String name);
}
public class Lambda {
    public static void main(String[] args) {
        Print p = (name) -> System.out.println("Printed :"+name);
        p.print("Indresh");
    }
}




