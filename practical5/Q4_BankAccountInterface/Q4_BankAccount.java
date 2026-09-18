// Import Scanner: used to read text and numbers typed on the keyboard by the user.
import java.util.Scanner;

/**
 * Account interface declaring the bank operations.
 * Any bank account class (e.g. SavingsAccount) must implement
 * these three operations.
 */
interface Account {
    /**
     * Adds money to the account balance.
     * @param amount the amount to deposit
     */
    void deposit(double amount);

    /**
     * Removes money from the account balance.
     * @param amount the amount to withdraw
     */
    void withdraw(double amount);

    /**
     * Prints the current account balance.
     */
    void checkBalance();
}

/**
 * SavingsAccount class implementing the Account interface.
 */
class SavingsAccount implements Account {
    // Stores the current money available in the account.
    double balance;

    /**
     * Constructor: Initializes the account with a starting balance.
     * @param initialBalance the balance the account starts with
     */
    SavingsAccount(double initialBalance) {
        // Store the starting balance into the account's balance field.
        balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        // Add the deposited amount to the current balance.
        balance += amount;
        // Confirm the deposit by printing the amount that was added.
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        // If the requested amount is more than what is available...
        if (amount > balance) {
            // ...reject the withdrawal and tell the user the balance is insufficient.
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            // Otherwise subtract the withdrawn amount from the balance.
            balance -= amount;
            // Confirm the withdrawal by printing the amount that was taken out.
            System.out.println("Withdrawn: " + amount);
        }
    }

    @Override
    public void checkBalance() {
        // Print the current money available in the account.
        System.out.println("Current Balance: " + balance);
    }
}

/**
 * Accepts the initial balance from the user and allows deposit,
 * withdrawal and balance enquiry operations.
 */
public class Q4_BankAccount {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the opening balance.
        System.out.print("Enter initial balance: ");
        // Read the decimal value typed by the user and store it in initial.
        double initial = sc.nextDouble();
        // Create a savings account starting with the entered balance.
        SavingsAccount account = new SavingsAccount(initial);

        // Will hold the menu option chosen by the user (loop control variable).
        int choice;
        // do-while loop: the menu is shown at least once and repeats
        // until the user picks option 4 (Exit).
        do {
            // Print the bank menu heading.
            System.out.println("\n--- Bank Account Menu ---");
            // Show the four available options.
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            // Prompt the user to pick an option.
            System.out.print("Enter your choice: ");
            // Read the chosen option number and store it in choice.
            choice = sc.nextInt();

            // Run the selected operation based on the chosen number.
            switch (choice) {
                case 1:
                    // Deposit option: ask how much money to add.
                    System.out.print("Enter amount to deposit: ");
                    // Read the amount and pass it straight to the deposit() method.
                    account.deposit(sc.nextDouble());
                    // Leave the switch after handling this option.
                    break;
                case 2:
                    // Withdraw option: ask how much money to take out.
                    System.out.print("Enter amount to withdraw: ");
                    // Read the amount and pass it straight to the withdraw() method.
                    account.withdraw(sc.nextDouble());
                    // Leave the switch after handling this option.
                    break;
                case 3:
                    // Balance option: show the current account balance.
                    account.checkBalance();
                    // Leave the switch after handling this option.
                    break;
                case 4:
                    // Exit option: print a goodbye message to the user.
                    System.out.println("Thank you for using the bank account system.");
                    // Leave the switch after handling this option.
                    break;
                default:
                    // Any number other than 1-4 is rejected as invalid.
                    System.out.println("Invalid choice.");
            }
            // Keep looping while the user has not chosen option 4 (Exit).
        } while (choice != 4);
    }
}