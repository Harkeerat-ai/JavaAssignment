// Import BufferedReader: reads a file line-by-line efficiently.
import java.io.BufferedReader;
// Import FileReader: a character stream that opens a connection to a file for reading.
import java.io.FileReader;
// Import IOException: the exception type thrown when file reading fails.
import java.io.IOException;
// Import Scanner: used to read the search word typed on the keyboard.
import java.util.Scanner;

/**
 * Searches for a specific word in a file and prints the number
 * of occurrences along with the line numbers where it appears.
 */
public class Q4_SearchWord {
    public static void main(String[] args) {
        // Create a Scanner object that reads from the keyboard.
        Scanner sc = new Scanner(System.in);
        // The file to search inside. Hard-coded default.
        String filename = "JavaFile1.txt";

        // Print a prompt (no newline) asking the user for the word to find.
        System.out.print("Enter the word to search for: ");
        // Read the single word typed by the user (stops at the first space or Enter).
        String searchWord = sc.next();

        // Total number of times the word appears, started at 0.
        int count = 0;
        // Tracks which line of the file we are currently on (for reporting). Starts at 0.
        int lineNo = 0;

        // try-with-resources: open the file for reading wrapped in a BufferedReader.
        // The reader auto-closes when the block ends.
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            // Will hold one line of the file at a time.
            String line;

            // readLine() returns the next line, or null at the end of the file. Loop until end.
            while ((line = reader.readLine()) != null) {
                // Move to the next line number (1-based line numbering).
                lineNo++;
                // Split the trimmed line on whitespace to get an array of individual words.
                String[] words = line.trim().split("\\s+");
                // Loop over every word in this line.
                for (String word : words) {
                    // Compare the current word with the search word, ignoring letter case
                    // (e.g. "Hello" and "hello" are treated as equal).
                    if (word.equalsIgnoreCase(searchWord)) {
                        // Match found: increment the occurrence counter.
                        count++;
                        // Print the line number and the trimmed contents of the line where it was found.
                        System.out.println("Found on line " + lineNo + ": \"" + line.trim() + "\"");
                    }
                }
                // End of the per-word loop.
            }
            // End of the while loop; the whole file has been searched.

            // Print the final total number of occurrences with a blank line before it.
            System.out.println("\nTotal occurrences of \"" + searchWord + "\": " + count);
        } catch (IOException e) {
            // If opening or reading the file fails, catch the error here.
            System.out.println("Error reading file: " + e.getMessage());
        }
        // End of try-catch. The reader was closed automatically.
    }
}