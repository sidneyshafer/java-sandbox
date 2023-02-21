package src.main.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import src.main.model.account.Account;

public class Bank {

    private ArrayList<Account> accounts;
    private ArrayList<Transaction> transactions;

    public Bank() {
        this.accounts = new ArrayList<Account>();
        this.transactions = new ArrayList<Transaction>();
    }

    public Transaction[] getTransactions(String accountId) {
        List<Transaction> list = this.transactions.stream()
        .filter((transaction) -> transaction.getId().equals(accountId))
        .collect(Collectors.toList());

        return list.toArray(new Transaction[list.size()]);
    }

    public Account getAccount(String transactionId) {
        return accounts.stream()
        .filter((account) -> account.getId().equals(transactionId))
        .findFirst().orElse(null);
    }

    public void addAccount(Account account) {
        this.accounts.add(account.clone());
    }

    private void addTransaction(Transaction transaction) {
        this.transactions.add(new Transaction(transaction));
    }

    public void withdrawTransaction(Transaction transaction) {
        if (getAccount(transaction.getId()).withdraw(transaction.getAmount())) {
            addTransaction(transaction);
        }
    }

    public void depositTransaction(Transaction transaction) {
        getAccount(transaction.getId().deposit(transaction.getAmount()));
    }
  
}
