package org.example.service;

import org.example.model.Account;
import org.example.repository.AccountRepository;

public class AccountService {

    private final AccountRepository repository = new AccountRepository();

    public void createAccount(Account account) {
        repository.createAccount(account);
    }

    public void deposit(long accountNumber, double amount) {
        Account account = repository.getAccountByNumber(accountNumber);

        if (account == null) {
            System.out.println("Account not found!");
            return;
        }

        account.setBalance(account.getBalance() + amount);
        repository.updateBalance(accountNumber, account.getBalance());
        System.out.println("Deposit successfully!");
    }

    public double checkBalance(long accountNumber) {
        Account account = repository.getAccountByNumber(accountNumber);

        if (account == null) {
            System.out.println("Account not found!");
            return 0;
        }

        System.out.println("Balance : " + account.getBalance());
        return account.getBalance();
    }

    public void withDraw(long accountNumber, double amount) {
        Account account = repository.getAccountByNumber(accountNumber);

        if (account == null) {
            System.out.println("Account not found!");
            return;
        }

        if (account.getBalance() < amount) {
            System.out.println("Insufficient Balance!");
        } else {
            account.setBalance(account.getBalance() - amount);
            repository.updateBalance(accountNumber, account.getBalance());
            System.out.println("Amount withdrawn successfully!");
        }
    }
}