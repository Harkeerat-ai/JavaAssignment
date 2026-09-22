// Import java.util.*: a wildcard import that brings in all classes from the java.util package,
// including the Scanner class used to read input typed on the keyboard.
import java.util.*;

/**
 * Reads a matrix from the user and displays its upper triangular portion
 * (elements where the row index is less than or equal to the column index).
 * Elements outside the upper triangle are displayed as zero.
 */
public class UpperDiag {
    public static void main(String[] args) {
        // Create a Scanner object that reads input typed on the keyboard.
        Scanner sc = new Scanner(System.in);

        // Ask the user how many rows the matrix should have and read the number.
        System.out.print("Please enter rows of the matrix : ");
        int rows = sc.nextInt();
        // Ask the user how many columns the matrix should have and read the number.
        System.out.print("Please enter columns of the matrix : ");
        int columns = sc.nextInt();

        // Create a 2D array with the given number of rows and columns to store the matrix.
        int arr[][] = new int[rows][columns];

        // Outer loop: go through each row of the matrix one at a time.
        for (int i = 0; i < rows; i++) {
            // Inner loop: go through each column of the current row.
            for (int j = 0; j < columns; j++) {
                // Prompt the user to enter the value for the current position (i, j).
                System.out.print("Please enter element at position : " + i + "," + j + " : ");
                // Store the entered value at position [i][j] of the array.
                arr[i][j] = sc.nextInt();
            }
        }

        // Print a heading before displaying the matrix the user entered.
        System.out.println("Matrix inputted : ");
        // Outer loop: go through each row so the matrix can be printed line by line.
        for (int i = 0; i < rows; i++) {
            // Inner loop: print each element of the current row followed by a space.
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            // After finishing a row, move to the next line.
            System.out.println();
        }

        // Display upper triangle: print element if row <= col, otherwise print 0
        // Print a blank line as a small separator before the upper-triangular view.
        System.out.println();
        // Outer loop: go through each row for the upper-triangular display.
        for (int i = 0; i < rows; i++) {
            // Inner loop: go through each column of the current row.
            for (int j = 0; j < columns; j++) {
                // An upper-triangular element is one where the row index is less than
                // or equal to the column index (i <= j).
                if (i <= j) {
                    // The element belongs to the upper triangle, so print its actual value.
                    System.out.print(arr[i][j] + " ");
                } else {
                    // The element lies below the diagonal, so print 0 instead.
                    System.out.print("0 ");
                }
            }
            // Move to the next line after finishing each row.
            System.out.println();
        }
    }
}
