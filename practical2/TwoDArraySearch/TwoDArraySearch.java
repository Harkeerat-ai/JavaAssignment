// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Reads a 2D array and a target number from the user, then searches for
 * the target in the array and prints its coordinates if found.
 */
public class TwoDArraySearch {
    public static void main(String[] args) {
        // Create a Scanner object that reads input typed on the keyboard.
        Scanner sc = new Scanner(System.in);

        // Ask the user how many rows the 2D array should have and read the number.
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Ask the user how many columns the 2D array should have and read the number.
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Create a 2D array with the given number of rows and columns.
        int[][] arr = new int[rows][cols];

        // Print a message asking the user to start entering the array elements.
        System.out.println("Enter the elements of the 2D array:");
        // Outer loop: go through each row of the 2D array.
        for (int i = 0; i < rows; i++) {
            // Inner loop: go through each column of the current row.
            for (int j = 0; j < cols; j++) {
                // Read the next number typed and store it at position [i][j].
                arr[i][j] = sc.nextInt();
            }
        }

        // Ask the user which number they want to search for and read it.
        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        // Linear search through each element of the 2D array
        // A flag that remembers whether the target has been found anywhere yet (starts false).
        boolean found = false;
        // Outer loop: go through each row while searching.
        for (int i = 0; i < rows; i++) {
            // Inner loop: go through each column of the current row.
            for (int j = 0; j < cols; j++) {
                // Check whether the element at (i, j) matches the target number.
                if (arr[i][j] == target) {
                    // Match found: print the row and column coordinates of the match.
                    System.out.println("Number found at index: (" + i + ", " + j + ")");
                    // Mark the flag as true so we know a match has been found.
                    found = true;
                    // Stop searching the inner loop (columns) for this row.
                    break;
                }
            }
            // If the target was already found, stop searching the outer loop (rows) too.
            if (found) {
                break;
            }
        }

        // If the flag is still false, the target was never found in the whole array.
        if (!found) {
            System.out.println("Number not found in the array.");
        }

        // Close the Scanner to free the system resources it uses.
        sc.close();
    }
}
