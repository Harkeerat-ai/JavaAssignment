// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Checks whether two user-provided strings are anagrams of each other
 * (contain the same characters with the same frequencies, case-insensitive).
 */
public class AnagramCheck {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Ask the user to type the first text.
        System.out.println("Please enter text 1 : ");
        // Read the first word and convert it to lowercase so the check ignores letter case.
        String text1 = sc.next().toLowerCase();
        // Ask the user to type the second text.
        System.out.println("Please enter text 2 : ");
        // Read the second word and convert it to lowercase.
        String text2 = sc.next().toLowerCase();

        // flag records whether the two texts are anagrams, assumed true until a mismatch is found.
        boolean flag = true;
        // count1 will count occurrences of a character in text1, reset for each character.
        int count1 = 0;
        // count2 will count occurrences of the same character in text2, reset for each character.
        int count2 = 0;
        // Convert text1 into a char array so we can visit each character.
        char[] arr1 = text1.toCharArray();
        // Convert text2 into a char array so we can visit each character.
        char[] arr2 = text2.toCharArray();

        // Quick length check — anagrams must have the same number of characters
        if (arr1.length != arr2.length) {
            // Different lengths mean they cannot possibly be anagrams.
            System.out.println("Not an anagram!!");
        } else {
            // For each character in text1, count its occurrences in both strings
            // Outer loop: pick each character of text1 one at a time.
            for (int a = 0; a < arr1.length; a++) {
                // Reset text1's count for this new character.
                count1 = 0;
                // Reset text2's count for this new character.
                count2 = 0;
                // Count how many times arr1[a] appears in arr1
                // Inner loop: scan all of arr1 to count matches with the chosen character.
                for (int b = 0; b < arr1.length; b++) {
                    if (arr1[a] == arr1[b]) {
                        count1++;
                    }
                }
                // Count how many times arr1[a] appears in arr2
                // Inner loop: scan all of arr2 to count matches with the same character.
                for (int b = 0; b < arr2.length; b++) {
                    if (arr1[a] == arr2[b]) {
                        count2++;
                    }
                }
                // If frequencies don't match, not an anagram
                // The character appears a different number of times in each text.
                if (count1 != count2) {
                    // Record that the texts are not anagrams.
                    flag = false;
                    // Stop checking the remaining characters since the answer is already known.
                    break;
                }
            }

            // If every character had matching frequencies, the texts are anagrams.
            if (flag) {
                System.out.println("Is an anagram!");
            // Otherwise at least one character frequency differed.
            } else {
                System.out.println("Not an anagram!!");
            }
        }
        // Close the Scanner to release the keyboard resource.
        sc.close();
    }
}