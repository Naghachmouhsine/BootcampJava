package bankingSystemwithTransactions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

abstract class BankAccount implements Transactable {
    protected String accountNumber;
    protected double balance;
    protected List<String> transactions = new ArrayList<>();

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void showTransactions() {
        System.out.println("Transactions for account " + accountNumber + " with balance :"+ balance);
        transactions.forEach(System.out::println);
    }
}
