import java.util.Scanner;

public class SMS{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your SMS: ");
        String input = sc.nextLine();

        // Using StringBuilder
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