package core;

import core.TestInterface;

class SBI implements TestInterface {
    public int rateOfInterest()
    {
        return 9;
    }
}
class PNB implements TestInterface{
    public int rateOfInterest()
    {
        return 8;
    }
}
class Bank{
    public static void main(String[] args){
        TestInterface b = new SBI();
        System.out.println("ROI: "+b.rateOfInterest());
        TestInterface c = new PNB();
        System.out.println("ROI: "+c.rateOfInterest());
    }}
