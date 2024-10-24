package testng;

import org.testng.annotations.Test;

public class TestNgPrority {
    @Test(priority = -2)
    public void zMethod(){
        System.out.println("z texts is printed");
    }

    @Test(priority = 0)
    public void aMethod(){
        System.out.println("a texts is printed");
    }

    @Test(priority = 1)
    public void mMethod(){
        System.out.println("m texts is printed");
    }
}
