// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;
// Note: IllegalArgumentException belongs to java.lang, so it does NOT need a separate import.

/**
 * Bank Account System that accepts the account holder's name and
 * withdrawal amount. Uses the throw statement to generate an
 * IllegalArgumentException if the amount exceeds the balance.
 */
public class Q4_BankAccount {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);
        // The customer's available balance, started at 10000 for this demonstration.
        double balance = 10000;

        // Print a prompt asking the user to enter the account holder's name.
        System.out.print("Enter account holder's name: ");
        // Read the whole name line typed by the user.
        String name = sc.nextLine();
        // Print a prompt asking the user to enter the amount to withdraw.
        System.out.print("Enter withdrawal amount: ");
        // Read the withdrawal amount as a decimal number (double).
        double withdrawal = sc.nextDouble();

        // Guard the withdrawal logic so an invalid amount is caught and reported.
        try {
            // Check whether the requested withdrawal is more than the available balance.
            if (withdrawal > balance) {
                // The amount is too large, so throw an IllegalArgumentException with a custom message.
                throw new IllegalArgumentException("Insufficient balance");
            }
            // If no exception was thrown, deduct the withdrawal from the balance.
            balance -= withdrawal;
            // Print a message confirming how much was withdrawn and by whom.
            System.out.println(name + ", you withdrew " + withdrawal + ".");
            // Print the updated remaining balance.
            System.out.println("Remaining balance: " + balance);
        } catch (IllegalArgumentException e) {
            // Runs when the withdrawal exceeds the balance (our business-rule error).
            System.out.println("Error: " + e.getMessage());
        }
    }
}