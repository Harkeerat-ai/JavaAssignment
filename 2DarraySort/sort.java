// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Sorts all elements of a 2D matrix in ascending order using a brute-force
 * nested-loop comparison approach (O(n^4) complexity).
 */
public class sort {
    public static void main(String[] args) {
        // Create a Scanner object that reads input typed on the keyboard.
        Scanner sc = new Scanner(System.in);

        // Ask the user how many rows the matrix should have and read the number.
        System.out.print("Rows: ");
        int r = sc.nextInt();

        // Ask the user how many columns the matrix should have and read the number.
        System.out.print("Columns: ");
        int c = sc.nextInt();

        // Create a 2D array (matrix) with r rows and c columns.
        int a[][] = new int[r][c];

        // Tell the user to begin typing the matrix elements.
        System.out.println("Enter elements:");
        // Outer loop: go through each row of the matrix.
        for (int i = 0; i < r; i++)
            // Inner loop: go through each column of the current row.
            for (int j = 0; j < c; j++)
                // Store the next entered number at position [i][j].
                a[i][j] = sc.nextInt();

        // Sort all elements by comparing every pair across the matrix:
        // this brute-force approach checks every element against every other element.
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int x = 0; x < r; x++) {
                    for (int y = 0; y < c; y++) {
                        // Swap if current element is smaller than the compared element:
                        // this repeatedly pushes the bigger elements towards the end.
                        if (a[i][j] < a[x][y]) {
                            // Use a temporary variable so the two values can be swapped safely.
                            int temp = a[i][j];
                            a[i][j] = a[x][y];
                            a[x][y] = temp;
                        }
                    }
                }
            }
        }

        // Print a heading before showing the sorted matrix.
        System.out.println("Sorted Matrix:");
        // Outer loop: go through each row so the sorted matrix can be printed line by line.
        for (int i = 0; i < r; i++) {
            // Inner loop: print each element of the current row followed by a space.
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            // After finishing a row, move to the next line.
            System.out.println();
        }
        // Close the Scanner to free the system resources it uses.
        sc.close();
    }
}
