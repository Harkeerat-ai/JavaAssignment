/**
 * Prints all prime numbers between 1 and 500 using a brute-force
 * divisibility check for each number.
 */
public class PrimeNumbersGeneration {
    public static void main(String[] args) {
        // n is the upper limit of the range we will search for primes.
        int n = 500;
        // Print a heading stating which range is being searched.
        System.out.println("Prime numbers between 1 and " + n + " are: ");

        // Check each number from 1 to n for primality
        // Outer loop: test every number in the range one by one.
        for (int i = 1; i <= n; i++) {
            // Assume the current number is prime until a divisor is found.
            boolean isPrime = true;

            // A prime has no divisors other than 1 and itself
            // Try every possible divisor from 2 up to half the number (i/2 is enough).
            for (int j = 2; j <= i / 2; j++) {
                // If j divides i exactly, then i is not prime.
                if (i % j == 0) {
                    // Mark the number as not prime.
                    isPrime = false;
                    // No need to keep checking; stop the divisor loop.
                    break;
                }
            }

            // Print if prime and greater than 1
            // 1 is not prime, and isPrime must be true, so only primes get printed.
            if (isPrime && i > 1) {
                // Print the prime followed by a space so all primes stay on one line.
                System.out.print(i + " ");
            }
        }
    }
}