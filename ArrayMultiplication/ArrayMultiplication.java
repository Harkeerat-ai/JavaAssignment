// Import java.util.*: a wildcard import that brings in all classes from the java.util package,
// including the Scanner class used to read input typed on the keyboard.
import java.util.*;
/**
 * Reads two matrices from the user, checks that they can be multiplied
 * (the number of columns of matrix 1 must equal the number of rows of matrix 2),
 * and if the condition holds, computes and prints their product.
 */
public class ArrayMultiplication{
    public static void main(String[] args){
        // Create a Scanner object that reads input typed on the keyboard.
        Scanner sc = new Scanner(System.in); // Initializing a new Scanner object named sc

        // Getting input from user for number of rows and columns
        // Ask the user how many rows the first matrix should have and read the number.
        System.out.print("Please enter the number of rows of matrix 1 : ");
        int rows1 = sc.nextInt();
        // Ask the user how many columns the first matrix should have and read the number.
        System.out.print("Please enter the number of cols of matrix 1 : ");
        int cols1 = sc.nextInt();
        // Ask the user how many rows the second matrix should have and read the number.
        System.out.print("Please enter the number of rows of matrix 2 : ");
        int rows2 = sc.nextInt();
        // Ask the user how many columns the second matrix should have and read the number.
        System.out.print("Please enter the number of cols of matrix 2 : ");
        int cols2 = sc.nextInt();
        
        // Matrix multiplication is only possible when the number of columns of the first
        // matrix equals the number of rows of the second matrix.
        if(cols1!=rows2){ // Mathematical matrix condition
            // Print an error message explaining why the matrices cannot be multiplied.
            System.out.println("ERROR : Rows of matrix 1 not equal to Columns of matrix 2");
            // Stop the program because the multiplication cannot be performed.
            return;
        }else{
            // Declaring the matrices
            // Create the first matrix with rows1 rows and cols1 columns.
            int mat1[][] = new int[rows1][cols1];
            // Create the second matrix with rows2 rows and cols2 columns.
            int mat2[][] = new int[rows2][cols2];

            // Taking input for elements of matrix 1
            // Outer loop: go through each row of the first matrix.
            for(int i=0; i<rows1; i++){
                // Inner loop: go through each column of the current row.
                for(int j=0; j<cols1; j++){
                    // Prompt the user to enter the value at position (i, j) of matrix 1.
                    System.out.print("Please enter element of matrix 1 at position : " + i + "," + j + " : ");
                    // Store the entered value in the first matrix.
                    mat1[i][j] = sc.nextInt();
                }
            }

            // Taking input for elements of matrix 2
            // Outer loop: go through each row of the second matrix.
            for(int i=0; i<rows2; i++){
                // Inner loop: go through each column of the current row.
                for(int j=0; j<cols2; j++){
                    // Prompt the user to enter the value at position (i, j) of matrix 2.
                    System.out.print("Please enter element of matrix 2 at position : " + i + "," + j + " : ");
                    // Store the entered value in the second matrix.
                    mat2[i][j] = sc.nextInt();
                }
            }

            // Create the result matrix: combining an (rows1 x cols1) with an (rows2 x cols2)
            // matrix gives a result with rows1 rows and cols2 columns.
            int result[][] = new int[rows1][cols2]; // Mathematical condition for resultant matrix
            // Calculating matrix
            // Outer loop: go over each row of the result matrix.
            for(int i=0; i<rows1; i++){
                // Loop over each column of the result matrix.
                for(int j=0; j<cols2; j++){
                    // Loop over the shared dimension: each result cell is a sum of products.
                    for(int k=0; k<cols1; k++){
                        // Add the contribution mat1[i][k] * mat2[k][j] to the result cell.
                        result[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
            // Outputting the result matrix
            // Outer loop: go through each row of the result matrix for printing.
            for(int i=0; i<rows2; i++){
                // Inner loop: print each element of the current result row followed by a space.
                for(int j=0; j<cols2; j++){
                    System.out.print(result[i][j] + " ");
                }
                // After finishing a row, move to the next line.
                System.out.println();
            }
        }
        // End of the if-else check on whether the two matrices can be multiplied.
    }
}