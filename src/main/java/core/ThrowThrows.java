package core;
import java.io.IOException;

public class ThrowThrows{
    void method() throws IOException{
        throw new IOException("device error");
    }
    void n()throws IOException{
        method();
    }
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("exception handled");
        }
    }
    public static void main(String[] args){
        ThrowThrows obj=new ThrowThrows();
        obj.p();
        System.out.println("normal flow...");
    }
}  