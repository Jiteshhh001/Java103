package Unit1;

public class Bank {
    private int balance=10000;
    public void withdrawal(int amount){
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        else{
            balance=balance-amount;
            System.out.println("Withdrawl Successful, Remaining balance: "+balance);
        }
    }
}
