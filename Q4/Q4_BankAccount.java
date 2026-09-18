// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;
// Note: IllegalArgumentException and Exception belong to java.lang, so they do NOT need a separate import.

/**
 * Bank Account System that accepts the account holder's name and a withdrawal
 * amount. It uses the 'throw' statement to generate an IllegalArgumentException
 * if the amount requested exceeds the current balance, and a catch-all Exception
 * block to handle any other unexpected errors.
 */
public class Q4_BankAccount {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // One try block protects all the risky input and withdrawal statements.
        try {
            // Print a prompt asking the user to enter the account holder's name.
            System.out.print("Enter account holder name: ");
            // Read the whole name line typed by the user.
            String name = sc.nextLine();
            // Print a prompt asking the user to enter the amount to withdraw.
            System.out.print("Enter withdrawal amount: ");
            // Read the amount as a decimal number (double).
            double amt = sc.nextDouble();
            // The customer's available balance, hard-coded for this demonstration.
            double balance = 110000;

            // Check whether the requested amount is more than the available balance.
            if (amt > balance) {
                // Amount is too large, so throw an IllegalArgumentException with a custom message.
                throw new IllegalArgumentException("Insufficient balance");
            }
            // If no exception was thrown, the withdrawal is valid: print the new remaining balance.
            System.out.println("Withdrawal successful. Remaining balance: " + (balance - amt));

        } catch (IllegalArgumentException e) {
            // Runs when the withdrawal amount exceeds the balance (our business-rule error).
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Runs for any other unexpected error (e.g. entering text instead of a number).
            System.out.println("An error occurred: " + e.getMessage());
        }

        // Close the Scanner to release the input resource attached to it.
        sc.close();
    }
}