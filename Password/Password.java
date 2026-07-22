import java.util.Scanner;

/**
 * Reads a password from the user and classifies it as "Strong" or "Weak".
 * A strong password must be at least 8 characters long and contain at least
 * one uppercase letter, one lowercase letter, one digit, and one special character.
 */
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        StringBuilder sb = new StringBuilder(password);

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        // Check each character for its type
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        boolean isLongEnough = sb.length() >= 8;

        // Password must meet all criteria to be considered strong
        if (isLongEnough && hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }

        sc.close();
    }
}
