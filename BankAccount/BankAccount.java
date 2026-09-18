/**
 * Account class representing a simple bank account with account number,
 * holder name and balance. Demonstrates default and parameterized constructors.
 */
class Account {
    // Account number that uniquely identifies this bank account.
    long accountNumber;
    // Name of the person who owns this bank account.
    String accountHolderName;
    // Current amount of money available in the account.
    double balance;

    /**
     * Default constructor: creates an empty Account using placeholder values.
     */
    Account() {
        // Store 0 as a placeholder account number because none was supplied.
        accountNumber = 0;
        // Store "Unknown" as the holder name because no name was supplied.
        accountHolderName = "Unknown";
        // Start the balance at 0.0 because no opening deposit was made.
        balance = 0.0;
    }

    /**
     * Parameterized constructor: creates an Account using the values passed in.
     */
    Account(long accNo, String name, double openingBalance) {
        // Copy the supplied account number into the instance field.
        accountNumber = accNo;
        // Copy the supplied holder name into the instance field.
        accountHolderName = name;
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
     * Displays the current balance of the account.
     */
    void displayBalance() {
        // Print the value currently stored in the balance field.
        System.out.println("Current Balance: " + balance);
    }

    /**
     * Displays the full details of the account (number, holder name and balance).
     */
    void displayAccountDetails() {
        // Print the account number stored in the object.
        System.out.println("Account Number: " + accountNumber);
        // Print the name of the account holder.
        System.out.println("Account Holder: " + accountHolderName);
        // Reuse displayBalance() to show the current balance.
        displayBalance();
    }
}

/**
 * Demonstrates the BankAccount management system using classes and objects.
 */
public class BankAccount {

    /**
     * Main method: creates two Account objects (one via each constructor),
     * performs deposits and withdrawals, and displays their details.
     */
    public static void main(String[] args) {
        // Create the first account using the default constructor (all placeholder values).
        Account a1 = new Account();
        // Print a header showing that this section belongs to the default account.
        System.out.println("--- Account 1 (Default Constructor) ---");
        // Show the initial details of the default account.
        a1.displayAccountDetails();
        // Deposit 5000 rupees into the first account.
        a1.deposit(5000);
        // Withdraw 2000 rupees from the first account.
        a1.withdraw(2000);
        // Show the details again to see the effect of the deposit and withdrawal.
        a1.displayAccountDetails();

        // Print a blank line to separate the two account sections.
        System.out.println();

        // Create the second account using the parameterized constructor.
        Account a2 = new Account(1023456789L, "Harkeerat", 10000);
        // Print a header showing that this section belongs to the parameterized account.
        System.out.println("--- Account 2 (Parameterized Constructor) ---");
        // Show the initial details of the second account.
        a2.displayAccountDetails();
        // Try to withdraw 12000 with only 10000 available (this should fail).
        a2.withdraw(12000);
        // Withdraw 4000 rupees (this should succeed).
        a2.withdraw(4000);
        // Show only the current balance of the second account.
        a2.displayBalance();
        // Show the complete final details of the second account.
        a2.displayAccountDetails();
    }
}