/**
 * Checks whether a number provided as a command-line argument is a Strong number.
 * A Strong number is one where the sum of the factorials of its digits equals
 * the number itself (e.g., 145 = 1! + 4! + 5!).
 */
public class StrongNumber {
    public static void main(String cp[]) {

        // Convert the first command-line argument (a String) into an integer.
        int num = Integer.parseInt(cp[0]);
        // Print the number that was supplied so the output shows the input.
        System.out.println("Num = " + num);

        // original keeps a working copy of the number so we can strip digits without losing num.
        int original = num;
        // sum accumulates the factorials of all the digits, started at 0.
        int sum = 0;

        // Process each digit of the number
        // Keep looping until every digit has been peeled off the number.
        while (original > 0) {
            // The modulo operator gives the units digit at each step.
            int digit = original % 10;
            // fact will hold the factorial of the current digit, started at 1.
            int fact = 1;

            // Calculate factorial of the current digit
            // Multiply everything from 1 up to the digit together.
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
                // Print the running factorial value as the multiplication progresses.
                System.out.println("Fact in = " + fact);
            }

            // Print the final factorial of the current digit.
            System.out.println("Fact = " + fact);
            // Add this digit's factorial to the running total.
            sum += fact;
            // Print the running total so far.
            System.out.println("Sum = " + sum);

            // Remove the current units digit so the next digit can be processed.
            original = original / 10;
        }

        // Check if sum of digit factorials equals the original number
        if (sum == num) {
            // The sum matches, so the number satisfies the Strong number rule.
            System.out.println("Strong number");
        // The sum does not match, so it is not a Strong number.
        } else {
            System.out.println("Not strong number");
        }
    }
}