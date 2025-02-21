public abstract class Account {
    private String accName;
    private int accNumber;
    private double balance;

    public Account(String accName, int accNumber, double balance){
        this.accName = accName;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public String getAccName() {
        return accName;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void display();
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}