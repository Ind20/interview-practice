package problems;

public class SplitReverseString {
    public static void main(String[] args) {
        String original = "selenium";
        String sub1 = original.substring(0, 4);
        String sub2 = original.substring(4);
        String rev1= "";
        String rev2= "";
        for(int i =0;i<sub1.length();i++){
            rev1=sub1.charAt(i)+rev1;
            rev2=sub2.charAt(i)+rev2;
        }
        System.out.println("Original string : "+original);
        System.out.println("output :"+rev1+rev2);
    }
}
