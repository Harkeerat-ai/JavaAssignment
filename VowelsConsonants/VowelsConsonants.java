// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Reads a word from the user and counts how many vowels (a, e, i, o, u)
 * and consonants it contains. The check is case-insensitive.
 */
public class VowelsConsonants {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Array of vowel characters to check against
        char[] arr = {'a', 'e', 'i', 'o', 'u'};

        // Read the word typed by the user and immediately convert it to lowercase for a case-insensitive check.
        String text = sc.next().toLowerCase();
        // count tracks how many vowels were found, started at 0.
        int count = 0;

        // Count vowels by checking each character against the vowel array
        // Outer loop: visit every character of the word.
        for (int i = 0; i < text.length(); i++) {
            // Inner loop: compare the current character against every vowel.
            for (int j = 0; j < arr.length; j++) {
                // If the current character matches one of the vowels...
                if (text.charAt(i) == arr[j]) {
                    // ...then increment the vowel counter.
                    count++;
                }
            }
        }

        // Print the number of vowels that were found.
        System.out.println("Vowels = " + count);
        // Consonants = total letters minus the vowels; print that result.
        System.out.println("Consonants = " + (text.length() - count));
    }
}