package problems;

import java.util.Scanner;

public class CompStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter first string");
        String str1 = in.nextLine();
        System.out.println("enter second string");
        String str2 = in.nextLine();
        if (str1.compareTo(str2)>0){
            System.out.println("string 1 is bigger");
        }else if (str1.compareTo(str2)<0){
            System.out.println("string 2 is bigger");
        }else {
            System.out.println("both string are equal");
        }
    }
}
