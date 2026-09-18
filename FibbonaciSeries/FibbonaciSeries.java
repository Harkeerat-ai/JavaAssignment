// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Generates and prints the Fibonacci series up to a user-specified number of
 * terms. Each term is the sum of the two preceding terms (starting with 0, 1).
 */
public class FibbonaciSeries {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Ask the user how many terms of the series they want.
        System.out.println("Please enter the range of the series : ");
        // Read the range as an integer.
        int range = sc.nextInt();

        // a and b hold the previous two terms; the series starts with 0 and 1.
        int a = 0, b = 1;
        // Print the first term (0) and start the series output.
        System.out.println("Series : \n" + a);

        // Generate subsequent terms by adding the previous two
        // Loop once for every remaining term in the requested range.
        for (int i = 1; i <= range; i++) {
            // Print the current second term (b) before shifting.
            System.out.println(b);
            // c is the sum of the previous two terms.
            int c = a + b;
            // Shift a forward to hold the old b.
            a = b;
            // Shift b forward to hold the newly computed term.
            b = c;
        }
    }
}