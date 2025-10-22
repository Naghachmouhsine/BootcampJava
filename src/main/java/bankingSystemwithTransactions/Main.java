package bankingSystemwithTransactions;

// Main
public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("accountSaving1", 1000);
        CheckingAccount ca = new CheckingAccount("accountChcking1", 500);

        sa.deposit(200);
        sa.withdraw(100);
        ca.withdraw(600);
        ca.deposit(300);

        TransactionManager manager = new TransactionManager();
        manager.addAccount(sa);
        manager.addAccount(ca);

        manager.showAllTransactions();
    }
}
