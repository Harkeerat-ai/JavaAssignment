/**
 * Counts and prints the number of odd integers between 1 and 500.
 */
public class OddCount {
    public static void main(String[] args) {
        int count = 0;

        // Check each number from 1 to 500; increment count for odd numbers
        for (int i = 1; i <= 500; i++) {
            if (i % 2 != 0)
                count++;
        }

        System.out.println("The number of odd numbers between 1 and 500 is : " + count);
    }
}
