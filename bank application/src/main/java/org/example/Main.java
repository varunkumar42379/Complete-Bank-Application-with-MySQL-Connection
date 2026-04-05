package org.example;

import org.example.model.Account;
import org.example.model.AccountType;
import org.example.service.AccountService;

public class Main {
    public static void main(String[] args) {

        AccountService service = new AccountService();

        Account account = new Account("varun", 12345L, "varun@123", AccountType.SALARY, 0);
        service.createAccount(account);

        service.checkBalance(12345L);

        service.deposit(12345L, 100000);

        service.checkBalance(12345L);

        service.withDraw(12345L, 200000);

        service.withDraw(12345L, 500);

        service.checkBalance(12345L);
    }
}