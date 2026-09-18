// Import java.util.*: brings in the Scanner class used to read text input typed on the keyboard.
import java.util.*;

/**
 * Reads a matrix from the user and displays its lower triangular portion
 * (elements where the row index is greater than the column index).
 * Elements outside the lower triangle are displayed as zero.
 */
public class LowerDiag {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Ask the user how many rows the matrix should have.
        System.out.print("Please enter rows of the matrix : ");
        // Read the row count as an integer.
        int rows = sc.nextInt();
        // Ask the user how many columns the matrix should have.
        System.out.print("Please enter columns of the matrix : ");
        // Read the column count as an integer.
        int columns = sc.nextInt();

        // Create a 2D array with the given number of rows and columns to store the matrix.
        int arr[][] = new int[rows][columns];

        // Read matrix elements from the user
        // Outer loop: go through each row of the matrix.
        for (int i = 0; i < rows; i++) {
            // Inner loop: go through each column of the current row.
            for (int j = 0; j < columns; j++) {
                // Ask the user for the element at the current row and column position.
                System.out.print("Please enter element at position : " + i + "," + j + " : ");
                // Store the typed value in the matrix.
                arr[i][j] = sc.nextInt();
            }
        }

        // Print a heading showing the matrix the user typed in.
        System.out.println("Matrix inputted : ");
        // Outer loop: print each row.
        for (int i = 0; i < rows; i++) {
            // Inner loop: print each element of the current row.
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            // Move to a new line after finishing a row.
            System.out.println();
        }

        // Display lower triangle: print element if row > col, otherwise print 0
        // Print a blank line to separate the original matrix from the lower-triangle version.
        System.out.println();
        // Outer loop: go through each row again.
        for (int i = 0; i < rows; i++) {
            // Inner loop: go through each column of the current row.
            for (int j = 0; j < columns; j++) {
                // If the row index is greater than the column index, this element belongs to the lower triangle.
                if (i > j) {
                    // Print the actual matrix element.
                    System.out.print(arr[i][j] + " ");
                // Otherwise the element is above the diagonal, so print 0 instead.
                } else {
                    System.out.print("0 ");
                }
            }
            // Move to a new line after finishing a row.
            System.out.println();
        }
    }
}