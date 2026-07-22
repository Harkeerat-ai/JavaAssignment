import java.util.Scanner;

/**
 * Computes the sum of the alternating series 1 - 3 + 5 - 7 + ... up to a
 * user-specified odd number. The sign alternates: odd-numbered terms are
 * positive, even-numbered terms are negative.
 */
public class Series2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the last odd number: ");
        int range = sc.nextInt();

        // Validate that the input is odd
        if (range % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }

        // Number of terms in the series
        int m = (range + 1) / 2;

        // Sum = m if m is odd, Sum = -m if m is even (derived from arithmetic series)
        int sum = (m % 2 == 0) ? -m : m;

        System.out.println("Sum = " + sum);
    }
}
