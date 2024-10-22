package core;

public class FindInArray {

    public static boolean isPresent(int s){
        int[] a = {1, 2, 3, 13, 4, 5, 6};
        try {
            for (int i = 0; i < a.length; i++) {
                if (s == a[i])
                    return true;
            }
        }catch(Exception e){
            e.printStackTrace();

        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPresent(8)?"element is present in array":"element is not present in array");
    }

}