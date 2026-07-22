import java.util.*;

/**
 * Reads a line of text from the user, prints each character on a separate
 * line, then counts and displays the total number of words and letters.
 */
public class wordLetterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter text : ");
        String text = sc.nextLine();

        char arr[] = text.toCharArray();

        // Print each character on its own line
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Count words (separated by spaces) and letters (non-space chars)
        int word = 1, letter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ')
                word++;
            else
                letter++;
        }

        System.out.println("Number of words = " + word + " and Number of letters = " + letter);
    }
}
