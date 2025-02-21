public class SavingAccount extends Account{
    public SavingAccount(String accName, int accNumber, double balance) {
        super(accName, accNumber, balance);
    }

    @Override
    public void display() {
        System.out.println("Savings account details: ");
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
        if(getBalance() - amount < 0){
            System.out.println("Insufficient funds");
        }
        else{
            setBalance(getBalance() - amount);
        }
    }


}
