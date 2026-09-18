// Import Scanner: used to read the SMS message text typed on the keyboard.
import java.util.Scanner;

/**
 * Reads an SMS message from the user and calculates how many characters
 * are used and how many remain out of the standard 160-character SMS limit.
 * Alerts the user if the message exceeds the limit.
 */
public class SMS {

    /**
     * Main method: gets an SMS from the user, counts its characters,
     * and reports how many characters are left (or how many were exceeded).
     */
    public static void main(String[] args) {

        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Prompt the user to type their SMS message.
        System.out.print("Enter your SMS: ");
        // Read the whole line typed by the user and store it in the String variable 'input'.
        String input = sc.nextLine();

        // Use StringBuilder to wrap the input so we can easily obtain its character count.
        StringBuilder sms = new StringBuilder(input);

        // Get the number of characters already used in the message.
        int charactersUsed = sms.length();
        // A standard single SMS allows up to 160 characters.
        int maxCharacters = 160;
        // Calculate how many characters are still available (can go negative if over the limit).
        int charactersLeft = maxCharacters - charactersUsed;

        // Tell the user how many characters were used in their message.
        System.out.println("Characters Used : " + charactersUsed);

        // Check whether the message fits within the 160-character limit.
        if (charactersLeft >= 0) {
            // Within the limit, so show how many characters remain available.
            System.out.println("Characters Left : " + charactersLeft);
        } else {
            // Over the limit, so negate the negative value to show the shortfall in characters.
            System.out.println("SMS limit exceeded by " + (-charactersLeft) + " characters.");
        }

        // Close the Scanner to release the keyboard resource.
        sc.close();
    }
}
