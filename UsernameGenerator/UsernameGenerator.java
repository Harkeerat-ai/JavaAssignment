import java.util.*;

/**
 * Reads a first name and last name from the user and generates a username
 * by concatenating them with a dot separator (e.g., "John.Doe").
 */
public class UsernameGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first name : ");
        String fname = sc.next();
        System.out.println("Please enter your last name : ");
        String lname = sc.next();

        // Build the username as FirstName.LastName using StringBuilder
        StringBuilder sb = new StringBuilder(fname);
        System.out.println("Your username is : " + sb.append('.' + lname));
    }
}
