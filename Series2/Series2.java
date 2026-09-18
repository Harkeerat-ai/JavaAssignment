// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Computes the sum of the alternating series 1 - 3 + 5 - 7 + ... up to a
 * user-specified odd number. The sign alternates: odd-numbered terms are
 * positive, even-numbered terms are negative.
 */
public class Series2 {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Ask the user for the last odd number of the series.
        System.out.print("Enter the last odd number: ");
        // Read the range as an integer.
        int range = sc.nextInt();

        // Validate that the input is odd
        // If the number is even, it cannot be the last term of this series.
        if (range % 2 == 0) {
            // Tell the user they must enter an odd number.
            System.out.println("Please enter an odd number.");
            // Stop the program early since the input is invalid.
            return;
        }

        // Number of terms in the series
        // For an odd range end, there are (range + 1) / 2 odd terms in total.
        int m = (range + 1) / 2;

        // Sum = m if m is odd, Sum = -m if m is even (derived from arithmetic series)
        // A ternary selects the sign of the sum based on whether the term count is even or odd.
        int sum = (m % 2 == 0) ? -m : m;

        // Print the computed sum of the alternating series.
        System.out.println("Sum = " + sum);
    }
}