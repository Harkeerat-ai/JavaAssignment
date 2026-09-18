// Import StringTokenizer: splits a sentence into separate words using spaces as delimiters.
import java.util.StringTokenizer;
// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Reads a sentence from the user and prints each word reversed.
 * Uses StringTokenizer to split the sentence into words and
 * StringBuilder.reverse() to reverse each word.
 */
public class Reverse {
    public static void main(String[] args) {

        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Ask the user to type in a sentence.
        System.out.print("Enter a sentence: ");
        // Read the whole line the user typed and store it in the String 'sentence'.
        String sentence = sc.nextLine();

        // Split the sentence into individual words
        // StringTokenizer breaks the sentence up, treating spaces as the word delimiters.
        StringTokenizer st = new StringTokenizer(sentence);

        // Keep looping as long as there is another word left to process.
        while (st.hasMoreTokens()) {
            // Take the next word from the tokenizer.
            String word = st.nextToken();

            // Reverse the current word using StringBuilder
            // Wrap the word in a StringBuilder so we can use its reverse() method.
            StringBuilder sb = new StringBuilder(word);
            // Reverse the word and print it, keeping it on the same line with a space.
            System.out.print(sb.reverse() + " ");
        }

        // Close the Scanner to release the keyboard resource.
        sc.close();
    }
}