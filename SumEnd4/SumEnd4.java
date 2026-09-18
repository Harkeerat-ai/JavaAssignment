// Import java.util.*: brings in the Scanner class used to read text input typed on the keyboard.
import java.util.*;

/**
 * Reads a matrix from the user and calculates the sum of all elements
 * whose last digit (units place) is 4.
 */
public class SumEnd4 {
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

        // Read matrix elements
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

        // Sum elements whose last digit (mod 10) equals 4
        // sum accumulates the total of the qualifying elements, started at 0.
        int sum = 0;
        // Outer loop: go through each row of the matrix.
        for (int i = 0; i < rows; i++) {
            // Inner loop: go through each column of the current row.
            for (int j = 0; j < columns; j++) {
                // The modulo operator gives the units digit; if it is 4 the element qualifies.
                if (arr[i][j] % 10 == 4) {
                    // Add this element to the running sum.
                    sum += arr[i][j];
                }
            }
        }

        // Print the total sum of all numbers ending in the digit 4.
        System.out.println(sum + " is the sum of all numbers ending in 4");
    }
}