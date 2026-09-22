// Import Scanner: used to read account details (account number, name, balance) typed on the keyboard.
import java.util.Scanner;

/**
 * Account class representing a simple bank account with account number,
 * holder name and balance.
 */
class BankAccount {
    // Account number that uniquely identifies this bank account.
    long accountNumber;
    // Name of the person who owns this bank account.
    String holderName;
    // Current amount of money available in the account.
    double balance;

    /**
     * Parameterized constructor: creates a BankAccount using the values passed in.
     */
    BankAccount(long accNo, String name, double openingBalance) {
        // Copy the supplied account number into the instance field.
        accountNumber = accNo;
        // Copy the supplied holder name into the instance field.
        holderName = name;
        // Store the opening balance as the starting balance of the account.
        balance = openingBalance;
    }

    /**
     * Adds the specified amount to the current balance.
     */
    void deposit(double amount) {
        // Add the deposited amount to the balance stored in the object.
        balance += amount;
        // Print a confirmation message showing how much was deposited.
        System.out.println("Deposited: " + amount);
    }

    /**
     * Withdraws the amount but only if sufficient balance is available.
     */
    void withdraw(double amount) {
        // Check whether the account has enough money before allowing the withdrawal.
        if (amount <= balance) {
            // Deduct the withdrawn amount from the available balance.
            balance -= amount;
            // Print a confirmation message showing how much was withdrawn.
            System.out.println("Withdrawn: " + amount);
        } else {
            // The account is short on funds, so tell the user the withdrawal failed.
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    /**
     * Displays the full details of the account (number, holder name and balance).
     */
    void displayDetails() {
        // Print the account number stored in the object.
        System.out.println("Account Number: " + accountNumber);
        // Print the name of the account holder.
        System.out.println("Account Holder: " + holderName);
        // Print the current balance of the account.
        System.out.println("Current Balance: " + balance);
    }
}

/**
 * Demonstrates an array of BankAccount objects for 5 customers.
 */
public class BankAccountArray {

    /**
     * Main method: reads details of 5 customers from the keyboard into an array,
     * then performs a deposit and a withdrawal on each account and shows the results.
     */
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);
        // Create an array that can hold 5 BankAccount objects (initially all null).
        BankAccount[] customers = new BankAccount[5];

        // Accept details for 5 customers
        // Loop through each position of the array and fill it with a customer's details.
        for (int i = 0; i < customers.length; i++) {
            // Print a heading with the current customer number (i+1 because the loop starts at 0).
            System.out.println("\n--- Enter details for Customer " + (i + 1) + " ---");
            // Ask the user to enter the account number.
            System.out.print("Enter Account Number: ");
            // Read the long value (the account number) typed by the user.
            long accNo = sc.nextLong();
            // Consume the leftover newline character so the next read works correctly.
            sc.nextLine();
            // Ask the user to enter the account holder name.
            System.out.print("Enter Account Holder Name: ");
            // Read the whole line (the holder name) typed by the user.
            String name = sc.nextLine();
            // Ask the user to enter the opening balance.
            System.out.print("Enter Opening Balance: ");
            // Read the double value (the opening balance) typed by the user.
            double bal = sc.nextDouble();
            // Create a new BankAccount from the entered values and store it at position i.
            customers[i] = new BankAccount(accNo, name, bal);
        }

        // Perform deposit and withdrawal for each customer
        // Loop again over every account in the array.
        for (int i = 0; i < customers.length; i++) {
            // Print a heading showing the current customer number.
            System.out.println("\n--- Customer " + (i + 1) + " ---");
            // Deposit 1000 rupees into the current customer's account.
            customers[i].deposit(1000);
            // Withdraw 500 rupees from the current customer's account.
            customers[i].withdraw(500);
            // Display the final details of the current customer's account.
            customers[i].displayDetails();
        }

        // Close the Scanner to release the keyboard resource.
        sc.close();
    }
}