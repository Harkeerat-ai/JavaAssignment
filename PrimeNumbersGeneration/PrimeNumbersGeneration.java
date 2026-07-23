/**
 * Prints all prime numbers between 1 and 500 using a brute-force
 * divisibility check for each number.
 */
public class PrimeNumbersGeneration {
    public static void main(String[] args) {
        int n = 500;
        System.out.println("Prime numbers between 1 and " + n + " are: ");

        // Check each number from 1 to n for primality
        for (int i = 1; i <= n; i++) {
            boolean isPrime = true;

            // A prime has no divisors other than 1 and itself
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print if prime and greater than 1
            if (isPrime && i > 1) {
                System.out.print(i + " ");
            }
        }
    }
}
