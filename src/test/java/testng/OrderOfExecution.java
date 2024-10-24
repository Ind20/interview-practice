package testng;

import org.testng.annotations.Test;

public class OrderOfExecution {
    @Test
    public void zMethod(){
        System.out.println("z texts is printed");
    }

    @Test
    public void aMethod(){
        System.out.println("a texts is printed");
    }

    @Test
    public void mMethod(){
        System.out.println("m texts is printed");
    }

}
