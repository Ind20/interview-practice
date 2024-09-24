package problems;

public class OverloadingWithDiffReturn {
    static int print(){
        return 6;

    }

    static String print(String name){
        return name;
    }

    static float print(float n){
        return n;

    }

    public static void main(String[] args) {
        System.out.println(print());
        System.out.println(print("indresh"));
        System.out.println(print(10.6F));
    }

    
}
