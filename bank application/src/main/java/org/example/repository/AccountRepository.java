package org.example.repository;

import org.example.model.Account;
import org.example.model.AccountType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRepository {

    public void createAccount(Account account) {
        String query = "insert into accounts(account_number, name, password, type, balance) values(?, ?, ?, ?, ?)";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setLong(1, account.getAccountNumber());
            ps.setString(2, account.getName());
            ps.setString(3, account.getPassword());
            ps.setString(4, account.getType().name());
            ps.setDouble(5, account.getBalance());

            ps.executeUpdate();
            System.out.println("Account created successfully!");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public Account getAccountByNumber(long accountNumber) {
        String query = "select * from accounts where account_number = ?";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setLong(1, accountNumber);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Account(
                        rs.getString("name"),
                        rs.getLong("account_number"),
                        rs.getString("password"),
                        AccountType.valueOf(rs.getString("type")),
                        rs.getDouble("balance")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return null;
    }

    public void updateBalance(long accountNumber, double balance) {
        String query = "update accounts set balance = ? where account_number = ?";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setDouble(1, balance);
            ps.setLong(2, accountNumber);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Balance updated successfully!");
            } else {
                System.out.println("Account not found!");
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}