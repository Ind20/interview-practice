package core;

public class BankAccount {
    private final String accountHolder = "javapractice.Test User";
    private int accountBalance = 50;


    public void checkBalance() {
        System.out.println(accountHolder+" your balance is : "+accountBalance);
    }

    public void deposit(int amount) {
        if(amount <= 0){
            System.out.println("Please provide a valid amount");
        }
        else{
            this.accountBalance = accountBalance+amount;
            System.out.println(accountHolder+" your new balance is : "+accountBalance);
        }

    }

    public void withdrawAmount(int amount){
        if(amount > accountBalance){
            System.out.println("insufficient amount!! your present balance is : "+accountBalance);
        }
        else{
            this.accountBalance = accountBalance-amount;
            System.out.println("Please collect :"+amount);
            System.out.println(accountHolder+" your new balance is : "+accountBalance);
        }
    }

}
