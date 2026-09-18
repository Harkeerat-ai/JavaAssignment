// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Reads a number as a string from the user and prints each digit
 * as its corresponding English word (e.g., "123" becomes "One Two Three").
 */
public class NumToString {
    public static void main(String[] args) {
        // Create a Scanner object that reads input typed on the keyboard.
        Scanner sc = new Scanner(System.in);

        // Ask the user to type a number.
        System.out.print("Enter a number: ");
        // Read the number as a String so that every digit (character) can be handled separately.
        String num = sc.next();

        // Loop through each digit (character) of the number, one at a time.
        for (int i = 0; i < num.length(); i++) {
            // Get the character at the current position i.
            char digit = num.charAt(i);

            // Use a switch to pick the English word that matches the current digit.
            switch (digit) {
                // Digit '0' is converted to the word "Zero".
                case '0':
                    System.out.print("Zero ");
                    break;
                // Digit '1' is converted to the word "One".
                case '1':
                    System.out.print("One ");
                    break;
                // Digit '2' is converted to the word "Two".
                case '2':
                    System.out.print("Two ");
                    break;
                // Digit '3' is converted to the word "Three".
                case '3':
                    System.out.print("Three ");
                    break;
                // Digit '4' is converted to the word "Four".
                case '4':
                    System.out.print("Four ");
                    break;
                // Digit '5' is converted to the word "Five".
                case '5':
                    System.out.print("Five ");
                    break;
                // Digit '6' is converted to the word "Six".
                case '6':
                    System.out.print("Six ");
                    break;
                // Digit '7' is converted to the word "Seven".
                case '7':
                    System.out.print("Seven ");
                    break;
                // Digit '8' is converted to the word "Eight".
                case '8':
                    System.out.print("Eight ");
                    break;
                // Digit '9' is converted to the word "Nine".
                case '9':
                    System.out.print("Nine ");
                    break;
                // If the character is not a digit, report it as invalid.
                default:
                    System.out.print("Invalid ");
            }
        }
    }
}
