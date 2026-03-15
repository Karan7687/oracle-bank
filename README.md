# Practice Bank

A simple console-based Java application for practicing banking operations.

## Features

- Create bank accounts
- Display account information
- Search for accounts by account number
- Perform transactions (deposit/withdraw)

## Project Structure

- `src/`: Contains all Java source files
  - `accMain.java`: Main class with the application entry point
  - `Account.java`: Base account class
  - `CurrentAccount.java`: Current account implementation
  - `SavingsAccount.java`: Savings account implementation
  - `Customer.java`: Customer information
  - `Address.java`: Address details
  - `Transaction.java`: Transaction handling
  - `bankInfo.java`: Bank operations logic
- `bin/`: Directory for compiled class files

## Database Structure

The application is designed to work with an Oracle database. The following tables represent the data structure:

### ACCOUNTS Table

- `ACC_NO` (NUMBER PRIMARY KEY)
- `PASSWORD` (VARCHAR2(50))
- `ACC_TYPE` (VARCHAR2(20)) -- 'Savings' or 'Current'
- `ACC_BAL` (NUMBER(10,2))

### CUSTOMERS Table

- `CUSTOMER_ID` (NUMBER PRIMARY KEY)
- `NAME` (VARCHAR2(100))
- `EMAIL` (VARCHAR2(100))
- `PHONE` (VARCHAR2(20))
- `ACC_NO` (NUMBER FOREIGN KEY REFERENCES ACCOUNTS(ACC_NO))

### ADDRESSES Table

- `ADDRESS_ID` (NUMBER PRIMARY KEY)
- `STREET` (VARCHAR2(200))
- `CITY` (VARCHAR2(50))
- `STATE` (VARCHAR2(50))
- `ZIP_CODE` (VARCHAR2(10))
- `CUSTOMER_ID` (NUMBER FOREIGN KEY REFERENCES CUSTOMERS(CUSTOMER_ID))

### TRANSACTIONS Table

- `TRANSACTION_ID` (NUMBER PRIMARY KEY)
- `ACC_NO` (NUMBER FOREIGN KEY REFERENCES ACCOUNTS(ACC_NO))
- `TRANSACTION_TYPE` (VARCHAR2(10)) -- 'Deposit' or 'Withdraw'
- `AMOUNT` (NUMBER(10,2))
- `TRANSACTION_DATE` (DATE)
- `DESCRIPTION` (VARCHAR2(200))

## How to Run

1. Ensure you have Java Development Kit (JDK) installed on your system.

2. Compile the Java files:

   ```
   javac -d bin src/*.java
   ```

3. Run the application:
   ```
   java -cp bin accMain
   ```

## Usage

The application provides a menu-driven interface:

- Enter 1 to create accounts
- Enter 2 to display all accounts
- Enter 3 to search for an account
- Enter 4 to perform a transaction

Follow the on-screen prompts to interact with the application.
