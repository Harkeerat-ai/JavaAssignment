// Import BufferedWriter: used to write text to a file efficiently (buffered so writes are done in bulk).
import java.io.BufferedWriter;
// Import FileWriter: a character stream that opens a connection to a file and lets us write text into it.
import java.io.FileWriter;
// Import IOException: the exception type thrown when a file operation (open/write) fails.
import java.io.IOException;
// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Creates a new text file "JavaFile1.txt" and writes the text
 * entered from the console into it.
 */
public class Q1_CreateFile {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Print a prompt telling the user what to enter.
        System.out.println("Enter the text to save in JavaFile1.txt (press Enter):");
        // Read the whole line typed by the user and store it in the String variable 'text'.
        String text = sc.nextLine();

        // try-with-resources: opens JavaFile1.txt for writing (overwrites existing content) and
        // wraps the FileWriter in a BufferedWriter for efficiency. The writer auto-closes at the end of this block.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("JavaFile1.txt"))) {
            // Write the user-entered text into the file.
            writer.write(text);
            // Print a confirmation message to the console.
            System.out.println("Text saved successfully to JavaFile1.txt");
        } catch (IOException e) {
            // If opening/writing the file fails, catch the error here.
            System.out.println("Error writing to file: " + e.getMessage());
        }
        // End of the try-catch block. The writer was closed automatically.
    }
}