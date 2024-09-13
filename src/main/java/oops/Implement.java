package oops;

class Animal {
    String name = "Animal";

    public void talk(){
        System.out.println("i am " + name);
    }

}

class Cat extends Animal {

    String name = "Cat";

    public void catTalk(){
        System.out.println("i am " + name);
    }
}

class BrownCat extends Cat {

    String name = "BrownCat";

    public void brownCatTalk(){
        System.out.println("i am " + name);
    }
}

public class Implement {
    public static void main(String[] args) {
        BrownCat obj = new BrownCat();
        obj.talk();
        obj.catTalk();
        obj.brownCatTalk();
    }
}
