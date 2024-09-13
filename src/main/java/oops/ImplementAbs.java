package oops;

abstract class AbstractExample {
    public void print(){
        System.out.println("parent print");
    }

    public abstract void run();
}

class ChildAbs extends AbstractExample{
    public void eat(){
        System.out.println("child eat");
    }

    public void print(){
        System.out.println("child print");
    }

    @Override
    public void run() {
        System.out.println("child runs");
    }
}

public class ImplementAbs{

    public static void main(String[] args) {
            ChildAbs obj = new ChildAbs();
            eat(obj);
            obj.run();
    }

    static void eat(ChildAbs a){
        a.print();
    }
}
