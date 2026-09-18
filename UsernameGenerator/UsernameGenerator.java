// Import the complete java.util package: provides Scanner for reading keyboard input.
import java.util.*;

/**
 * Reads a first name and last name from the user and generates a username
 * by concatenating them with a dot separator (e.g., "John.Doe").
 */
public class UsernameGenerator {

    /**
     * Main method: asks the user for their first and last name, then builds
     * and prints a username in the format FirstName.LastName.
     */
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their first name.
        System.out.println("Please enter your first name : ");
        // Read the first token (the first name) typed by the user.
        String fname = sc.next();
        // Prompt the user to enter their last name.
        System.out.println("Please enter your last name : ");
        // Read the next token (the last name) typed by the user.
        String lname = sc.next();

        // Build the username as FirstName.LastName using StringBuilder
        StringBuilder sb = new StringBuilder(fname);
        // Append a dot and the last name to the first name, then print the final username.
        System.out.println("Your username is : " + sb.append('.' + lname));
    }
}
