// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Reads a password from the user and classifies it as "Strong" or "Weak".
 * A strong password must be at least 8 characters long and contain at least
 * one uppercase letter, one lowercase letter, one digit, and one special character.
 */
public class Password {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);
        // Ask the user to type in their password.
        System.out.print("Enter Password: ");
        // Read the whole line typed by the user (so spaces inside the password are kept).
        String password = sc.nextLine();

        // Wrap the password in a StringBuilder so we can conveniently read its characters.
        StringBuilder sb = new StringBuilder(password);

        // Flags that track whether we have seen each character type, all started at false.
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        // Check each character for its type
        // Loop over every character in the password.
        for (int i = 0; i < sb.length(); i++) {
            // Grab the character at position i.
            char ch = sb.charAt(i);

            // If this character is an uppercase letter, remember that we found one.
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            // Otherwise, if it is a lowercase letter, remember that we found one.
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            // Otherwise, if it is a digit, remember that we found one.
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            // Otherwise, if it is neither a letter nor a digit, it must be a special character.
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        // Check whether the password length meets the minimum of 8 characters.
        boolean isLongEnough = sb.length() >= 8;

        // Password must meet all criteria to be considered strong
        // All four character types AND at least 8 characters must be present.
        if (isLongEnough && hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Strong Password");
        // Otherwise the password is too weak.
        } else {
            System.out.println("Weak Password");
        }

        // Close the Scanner to release the keyboard resource.
        sc.close();
    }
}