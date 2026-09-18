// Import java.util.*: brings in the Scanner class used to read text input typed on the keyboard.
import java.util.*;

/**
 * Reads a line of text from the user, prints each character on a separate
 * line, then counts and displays the total number of words and letters.
 */
public class wordLetterCount {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Ask the user to type in a line of text.
        System.out.println("Please enter text : ");
        // Read the whole line the user typed and store it in the String 'text'.
        String text = sc.nextLine();

        // Convert the line into a char array so we can visit each character one by one.
        char arr[] = text.toCharArray();

        // Print each character on its own line
        // Loop over the entire char array.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Count words (separated by spaces) and letters (non-space chars)
        // word starts at 1 because the last word has no space after it; letter counts non-space characters.
        int word = 1, letter = 0;
        // Loop over every character again.
        for (int i = 0; i < arr.length; i++) {
            // A space marks the end of one word, so increment the word counter.
            if (arr[i] == ' ')
                word++;
            // Any character that is not a space counts as a letter.
            else
                letter++;
        }

        // Print the final word and letter counts together.
        System.out.println("Number of words = " + word + " and Number of letters = " + letter);
    }
}