import java.util.Scanner;

/**
 * Reads an SMS message from the user and calculates how many characters
 * are used and how many remain out of the standard 160-character SMS limit.
 * Alerts the user if the message exceeds the limit.
 */
public class SMS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your SMS: ");
        String input = sc.nextLine();

        // Use StringBuilder to easily obtain the character count
        StringBuilder sms = new StringBuilder(input);

        int charactersUsed = sms.length();
        int maxCharacters = 160;
        int charactersLeft = maxCharacters - charactersUsed;

        System.out.println("Characters Used : " + charactersUsed);

        if (charactersLeft >= 0) {
            System.out.println("Characters Left : " + charactersLeft);
        } else {
            System.out.println("SMS limit exceeded by " + (-charactersLeft) + " characters.");
        }

        sc.close();
    }
}
