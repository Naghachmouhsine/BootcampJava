package bankingSystemwithTransactions;

import java.util.Date;

class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.02; //2% interest
    private static final double WITHDRAWAL_FEE = 1.5;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        double interest = amount * INTEREST_RATE;
        balance += amount + interest;
        transactions.add("Deposited: " + amount + " (+ interest " + interest + ") at "+new Date());
    }

    @Override
    public void withdraw(double amount) {
        double total = amount + WITHDRAWAL_FEE;
        if (balance >= total) {
            balance -= total;
            transactions.add("Withdrew: " + amount + " (- fee " + WITHDRAWAL_FEE + ") at "+new Date());
        } else {
            transactions.add("Failed withdrawal: insufficient funds");
        }
    }
}