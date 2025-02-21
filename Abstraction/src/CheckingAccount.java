public class CheckingAccount extends Account{
    public CheckingAccount(String accName, int accNumber, double balance){
        super(accName, accNumber, balance);
    }

    @Override
    public void display() {
        System.out.println("Checking account details: ");
        System.out.println("Name: " + getAccName());
        System.out.println("Account Number: " + getAccNumber());
        System.out.println("Balance: " + getBalance());
        System.out.println();
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance() - amount < -500){
            System.out.println("Overdraft limit reached");
        }
        else {
            setBalance(getBalance() - amount);
        }
    }
}
