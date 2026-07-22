import java.util.*;

/**
 * Reads a square matrix from the user, computes the product of all
 * elements on the main diagonal (where row index equals column index),
 * and prints the result.
 */
public class ProductDiag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter rows of the matrix : ");
        int rows = sc.nextInt();
        System.out.print("Please enter columns of the matrix : ");
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];

        // Read matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Please enter element at position : " + i + "," + j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix inputted : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Multiply all diagonal elements (where row == col)
        int product = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == j) {
                    product *= arr[i][j];
                }
            }
        }

        System.out.println(product + " Is the product of all the diagonal elements");
    }
}
