/**
 * Counts and prints the number of odd integers between 1 and 500 (inclusive).
 */
public class OddCount {
    public static void main(String[] args) {
        // Start the counter at 0 because no odd numbers have been counted yet.
        int count = 0;

        // Check each number from 1 to 500; increment count for odd numbers:
        // the loop below visits every whole number between 1 and 500 (inclusive).
        for (int i = 1; i <= 500; i++) {
            // A number is odd when dividing it by 2 leaves a remainder (i % 2 != 0).
            if (i % 2 != 0)
                // The current number is odd, so increase the counter by 1.
                count++;
        }

        // Print the final total number of odd numbers found in the range.
        System.out.println("The number of odd numbers between 1 and 500 is : " + count);
    }
}
