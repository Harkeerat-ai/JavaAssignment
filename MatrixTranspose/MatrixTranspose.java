import java.util.*;

/**
 * Reads a matrix from the user and prints both the original matrix
 * and its transpose (rows become columns and vice versa).
 */
public class MatrixTranspose {
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

        // Print transpose by swapping row and column indices
        System.out.println("Transpose Matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
