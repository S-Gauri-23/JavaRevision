import java.util.Date;

public class Transaction {
    private double amount;
    private Date date;
    private Account account;

    public Transaction(double amount, Date date, Account account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public void display(){
        System.out.print("Transaction details: ");
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date);
        System.out.println("Account Number: " + account.getAccName());
        System.out.println("Account Name: " + account.getAccName());
        System.out.println("New Balance: " + account.getBalance());
        System.out.println();
    }
}
