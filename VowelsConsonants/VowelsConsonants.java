import java.util.Scanner;

/**
 * Reads a word from the user and counts how many vowels (a, e, i, o, u)
 * and consonants it contains. The check is case-insensitive.
 */
public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of vowel characters to check against
        char[] arr = {'a', 'e', 'i', 'o', 'u'};

        String text = sc.next().toLowerCase();
        int count = 0;

        // Count vowels by checking each character against the vowel array
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (text.charAt(i) == arr[j]) {
                    count++;
                }
            }
        }

        System.out.println("Vowels = " + count);
        System.out.println("Consonants = " + (text.length() - count));
    }
}
