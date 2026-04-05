package org.example.model;

public class Account {

    private String name;
    private long accountNumber;
    private String password;
    private AccountType type;
    private double balance;

    public Account(String name, long accountNumber, String password, AccountType type, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.password = password;
        this.type = type;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", password='" + password + '\'' +
                ", type=" + type +
                ", balance=" + balance +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}