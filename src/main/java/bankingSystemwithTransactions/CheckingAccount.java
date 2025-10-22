package bankingSystemwithTransactions;

import java.util.Date;

class CheckingAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = -200;
    private static final double OVERDRAFT_PENALTY = 20;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < OVERDRAFT_LIMIT) {
            transactions.add("Withdrawal denied: overdraft limit exceeded");
        } else {
            balance -= amount;
            if (balance < 0) {
                balance -= OVERDRAFT_PENALTY;
                transactions.add("Withdrew: " + amount + " (overdraft penalty applied) at "+new Date());
            } else {
                transactions.add("Withdrew: " + amount+"at "+new Date());
            }
        }
    }
}

