package problems;


public class checkReverse {
    public static void main(String[] args) {
        String[] str = {"pot", "cat", "moon", "sun", "noom", "top"};

        for(int i=0; i< str.length;i++) {
            String rev = "";
            for (int j = 0; j < str[i].length(); j++) {
                rev = str[i].charAt(j) + rev;
            }

            for (int k =i+1; k<str.length;k++ ) {
                if (str[k].contains(rev)) {
                    System.out.println(str[i] + "=" + rev);
                }
            }
        }

    }
}




