package bankingSystemwithTransactions;

import java.util.ArrayList;
import java.util.List;

// Challenge: TransactionManager
class TransactionManager {
    private List<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void showAllTransactions() {
        accounts.forEach(BankAccount::showTransactions);
    }
}
