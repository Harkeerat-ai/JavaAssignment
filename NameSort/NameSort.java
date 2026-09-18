// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Reads a list of names from the user and sorts them alphabetically
 * using the Bubble Sort algorithm with String comparison.
 */
public class NameSort {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter how many names they want to sort.
        System.out.print("Enter number of names: ");
        // Read the count as an integer.
        int n = sc.nextInt();

        // Create an array of Strings with enough slots to hold all the names.
        String names[] = new String[n];

        // Ask the user to type in the names.
        System.out.println("Enter names:");
        // Loop once for every name slot and read each name into the array.
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        // Bubble sort: compare adjacent names and swap if out of alphabetical order
        // Outer loop: controls the number of passes over the array.
        for (int i = 0; i < n - 1; i++) {
            // Inner loop: with each pass one name settles at its final sorted position, so we can ignore it next time.
            for (int j = 0; j < n - 1 - i; j++) {
                // compareTo returns positive if names[j] > names[j+1]
                if (names[j].compareTo(names[j + 1]) > 0) {
                    // Save the current name in a temporary variable before overwriting it.
                    String temp = names[j];
                    // Move the alphabetically-smaller name down one position.
                    names[j] = names[j + 1];
                    // Put the larger name into the later slot.
                    names[j + 1] = temp;
                }
            }
        }

        // Tell the user the sorted list is about to be printed.
        System.out.println("Names in Alphabetical Order:");
        // Loop over the entire array and print each name in its sorted position.
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}