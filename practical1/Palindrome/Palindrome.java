// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Reads a string from the user and checks whether it is a palindrome
 * (reads the same forwards and backwards, case-insensitive).
 */
public class Palindrome {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);
        // Ask the user to type in a word.
        System.out.println("Please enter your string : ");
        // Read the word typed by the user.
        String text = sc.next();
        // Convert it to lowercase so the palindrome check ignores letter case.
        text = text.toLowerCase();

        // Assume the word is a palindrome; we will set this to false if a mismatch is found.
        boolean isPalindrome = true;

        // Compare characters from both ends moving inward
        // Only need to check up to the middle of the word; each pair is compared once.
        for (int i = 0; i <= text.length() / 2; i++) {
            // Compare the i-th character from the left with the matching character from the right.
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                // The characters differ, so the word is not a palindrome.
                isPalindrome = false;
                // Stop checking further characters since we already know the answer.
                break;
            }
        }

        // If no mismatches were found, the word reads the same forwards and backwards.
        if (isPalindrome)
            System.out.println(text + " is a palindrome!!");
        // Otherwise it is not a palindrome.
        else
            System.out.println(text + " is not a palindrome!!");
    }
}