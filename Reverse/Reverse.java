import java.util.StringTokenizer;
import java.util.Scanner;

/**
 * Reads a sentence from the user and prints each word reversed.
 * Uses StringTokenizer to split the sentence into words and
 * StringBuilder.reverse() to reverse each word.
 */
public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split the sentence into individual words
        StringTokenizer st = new StringTokenizer(sentence);

        while (st.hasMoreTokens()) {
            String word = st.nextToken();

            // Reverse the current word using StringBuilder
            StringBuilder sb = new StringBuilder(word);
            System.out.print(sb.reverse() + " ");
        }

        sc.close();
    }
}
