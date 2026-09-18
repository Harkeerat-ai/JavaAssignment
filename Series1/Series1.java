// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Computes the sum of the series (i^2 / i!) for i = 1 to a user-specified
 * range. Each term is calculated as the square of i divided by the factorial of i.
 */
public class Series1 {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Ask the user for the last value of i in the series.
        System.out.println("Please enter the range of the series : ");
        // Read the range as an integer.
        int range = sc.nextInt();

        // sum stores the running total of all the terms; it is a double because terms are divisions.
        double sum = 0;

        // Compute each term: i^2 / i!
        // Outer loop: one iteration per value of i from 1 up to the range.
        for (int i = 1; i <= range; i++) {
            // exp is the square of i, the numerator of the term.
            double exp = i * i;
            // fact will hold the factorial of i, started at 1.
            double fact = 1;

            // Calculate factorial of i
            // Multiply every number from 1 up to i together.
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }

            // div is the current term: i squared divided by i factorial.
            double div = exp / fact;
            // Add the term to the running total.
            sum += div;
        }

        // Print the final sum of the whole series for the given range.
        System.out.println("Sum of the series for the range : " + range + " = " + sum);
    }
}