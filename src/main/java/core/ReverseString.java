package core;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "indresh";
        StringBuilder s2= new StringBuilder();
        for(int i=0; i<s1.length();i++){
            s2.insert(0, s1.charAt(i));
        }
        System.out.println("reverced string is :"+s2);
    }

}
