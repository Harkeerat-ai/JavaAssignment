import java.util.Scanner;

/**
 * Checks whether two user-provided strings are anagrams of each other
 * (contain the same characters with the same frequencies, case-insensitive).
 */
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter text 1 : ");
        String text1 = sc.next().toLowerCase();
        System.out.println("Please enter text 2 : ");
        String text2 = sc.next().toLowerCase();

        boolean flag = true;
        int count1 = 0;
        int count2 = 0;
        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();

        // Quick length check — anagrams must have the same number of characters
        if (arr1.length != arr2.length) {
            System.out.println("Not an anagram!!");
        } else {
            // For each character in text1, count its occurrences in both strings
            for (int a = 0; a < arr1.length; a++) {
                count1 = 0;
                count2 = 0;
                // Count how many times arr1[a] appears in arr1
                for (int b = 0; b < arr1.length; b++) {
                    if (arr1[a] == arr1[b]) {
                        count1++;
                    }
                }
                // Count how many times arr1[a] appears in arr2
                for (int b = 0; b < arr2.length; b++) {
                    if (arr1[a] == arr2[b]) {
                        count2++;
                    }
                }
                // If frequencies don't match, not an anagram
                if (count1 != count2) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("Is an anagram!");
            } else {
                System.out.println("Not an anagram!!");
            }
        }
    }
}
