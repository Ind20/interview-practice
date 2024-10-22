package problems;

public class OverloadingWithDiffReturn {
    static int print(){
        return 6;
    }

    static String print(String name){
        return name;
    }

    public static void main(String[] args) {
        System.out.println(print());
        System.out.println(print("indresh"));
    }
}
