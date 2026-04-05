# Complete-Bank-Application-with-MySQL-Connection

# 🏦 Bank Application (Java + MySQL)

This is a simple Bank Application built using Core Java and MySQL (JDBC).
It helps you understand how real applications work with database integration.

--------------------------------------------------

🚀 Features
- Create Account
- Deposit Money
- Withdraw Money
- Check Balance
- Data stored in MySQL database

--------------------------------------------------

🛠️ Technologies Used
- Java (Core Java, OOP)
- JDBC
- MySQL
- Maven (optional)

--------------------------------------------------

📂 Project Structure

bank-application/
└── src/
└── main/
└── java/
└── org/
└── example/
├── model/
│ ├── Account.java
│ └── AccountType.java
│
├── repository/
│ ├── DatabaseConnection.java
│ └── AccountRepository.java
│
├── service/
│ └── AccountService.java
│
└── Main.java

--------------------------------------------------

⚙️ Setup Instructions

1. Create Database (MySQL)

Run this:

CREATE DATABASE bank_application;

USE bank_application;

CREATE TABLE accounts (
    account_number BIGINT PRIMARY KEY,
    name VARCHAR(100),
    password VARCHAR(100),
    type VARCHAR(20),
    balance DOUBLE
);

--------------------------------------------------

2. Update DB Credentials (DatabaseConnection.java)

private static final String URL = "jdbc:mysql://localhost:3306/bank_application";
private static final String USERNAME = "root";
private static final String PASSWORD = "2002";

--------------------------------------------------

3. Add Dependency (Maven)

<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>9.3.0</version>
</dependency>

--------------------------------------------------

4. Run Application (Main.java)

AccountService service = new AccountService();

service.createAccount(new Account("Varun", 12345L, "pass", AccountType.SALARY, 0));

service.deposit(12345L, 1000);
service.checkBalance(12345L);
service.withDraw(12345L, 500);

--------------------------------------------------

📌 Sample Output

Account created successfully!
Deposit successfully!
Balance : 1000.0
Amount withdrawn successfully!
Balance : 500.0

--------------------------------------------------

🎯 What You Learn
- JDBC connection
- CRUD operations
- OOP concepts
- Layered architecture

--------------------------------------------------

🔮 Future Improvements
- Login system
- Spring Boot version
- Transaction history
- Exception handling

--------------------------------------------------

👨‍💻 Author
Varun Kumar
Github : https://github.com/varunkumar42379/Complete-Bank-Application-with-MySQL-Connection

--------------------------------------------------

⭐ Give a star if you like this project!
