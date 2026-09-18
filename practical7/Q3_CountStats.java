// Import BufferedReader: reads a file line-by-line efficiently.
import java.io.BufferedReader;
// Import FileReader: a character stream that opens a connection to a file for reading.
import java.io.FileReader;
// Import IOException: the exception type thrown when file reading fails.
import java.io.IOException;

/**
 * Counts the number of lines, words and characters in a given text file.
 * Pass the filename as a command-line argument or uses "JavaFile1.txt" by default.
 */
public class Q3_CountStats {
    public static void main(String[] args) {
        // The file to analyze. Hard-coded default (a command line arg could override it, but it isn't used here).
        String filename = "JavaFile1.txt";

        // Counter for the number of lines, started at 0.
        int lines = 0;
        // Counter for the number of words, started at 0.
        int words = 0;
        // Counter for the number of characters, started at 0.
        int characters = 0;

        // try-with-resources: open the file for reading and wrap it in a BufferedReader
        // so we can read whole lines. The reader auto-closes when the block ends.
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            // Will hold one line of the file at a time.
            String line;

            // readLine() returns the next line, or null when there is no more data (end of file).
            // The loop keeps running while the returned value is NOT null.
            while ((line = reader.readLine()) != null) {
                // This line counts, so increment the line counter.
                lines++;
                // Add the length of the current line to the total character count.
                // (Note: this does NOT count the invisible newline characters between lines.)
                characters += line.length();
                // Split the trimmed line on one-or-more whitespace characters (\s+) to get an array of words.
                // trim() removes leading/trailing spaces so we don't get empty tokens.
                String[] tokens = line.trim().split("\\s+");
                // Guard: only count words if the line is not blank (avoid counting empty lines as having a word).
                if (!line.trim().isEmpty()) {
                    // Add the number of words on this line to the total word count.
                    words += tokens.length;
                }
            }
            // End of the while loop; we have finished reading every line.

            // Print the name of the file that was analyzed.
            System.out.println("File: " + filename);
            // Print the total number of lines found.
            System.out.println("Number of Lines: " + lines);
            // Print the total number of words found.
            System.out.println("Number of Words: " + words);
            // Print the total number of characters found.
            System.out.println("Number of Characters: " + characters);
        } catch (IOException e) {
            // If opening or reading the file fails, catch the error here.
            System.out.println("Error reading file: " + e.getMessage());
        }
        // End of try-catch. The reader was closed automatically.
    }
}