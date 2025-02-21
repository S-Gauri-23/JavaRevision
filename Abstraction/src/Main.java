//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //manages the bank accounts and transactions
        Banking banking = new Banking();

        SavingAccount savingAccount = new SavingAccount("John Smith",
                123456789, 1000.0);
        CheckingAccount checkingAccount = new CheckingAccount("Jane Doe",
                987654321,5000.0);
        banking.addAccount(savingAccount);
        banking.addAccount(checkingAccount);

        savingAccount.display();
        savingAccount.deposit(500);
        banking.processTransaction(savingAccount, 500);
        savingAccount.display();


        checkingAccount.display();
        checkingAccount.withdraw(500);
        banking.processTransaction(checkingAccount, 500);
        checkingAccount.display();

        banking.removeAccount(savingAccount);
    }
}