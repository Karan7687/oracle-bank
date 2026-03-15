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
