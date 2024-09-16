package javapractice;

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.checkBalance();
        obj.deposit(100);
        obj.checkBalance();
        obj.withdrawAmount(25);

    }
}
