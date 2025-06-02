
# Simple Bank Management System

A basic command-line bank management system implemented in Java using Object-Oriented Programming (OOP) concepts.

## Features

This system provides the following functionalities:

1.  **Withdraw**: Withdraw money from the account.
2.  **Deposit**: Deposit money into the account.
3.  **Check Balance**: View the current account balance.
4.  **Mini Statement**: See a list of recent transactions.
5.  **Exit**: Close the application.

## Technologies Used

*   Java

## OOP Concepts Applied

*   **Classes and Objects**: `BankAccount` and `Transaction` classes represent real-world entities.
*   **Encapsulation**: Data (like balance, account number) and methods (like withdraw, deposit) are bundled within classes, and data is protected using access modifiers (`private`).

## Setup and Running

1.  **Prerequisites**: Ensure you have the Java Development Kit (JDK) installed on your system.
2.  **Clone or Download**: Get the project files.
3.  **Compile**: Open a terminal or command prompt, navigate to the project directory, and compile the Java files:

    ```bash
    javac BankAccount.java Transaction.java BankManagementSystem.java
    ```
4.  **Run**: Execute the main class:

    ```bash
    java BankManagementSystem
    ```

## How to Use

Once the application is running, follow the on-screen menu to choose an option (1-5) and interact with the bank account.

## Project Structure

*   `BankAccount.java`: Defines the `BankAccount` class with methods for transactions and balance inquiry.
*   `Transaction.java`: Defines the `Transaction` class to record transaction details.
*   `BankManagementSystem.java`: Contains the `main` method to run the application and handle user input.
*   `README.md`: This file.

## Future Improvements (Optional)

*   Add support for multiple accounts.
*   Implement user authentication.
*   Store data persistently (e.g., using files or a database).
*   Improve error handling.
*   Add more detailed transaction history.
