package core;

//declare an int variable and print its value
public class Variable {
    private static int a = 5;
    public void setInt(int n){
        a = n;
    }

    public static void main(String[] args) {
        Variable obj = new Variable();
        obj.setInt(10);
        System.out.println(obj.a);
        Variable obj1 = new Variable();
        System.out.println(obj1.a);
    }

}
